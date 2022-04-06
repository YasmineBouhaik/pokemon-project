function launchGame(){
    setTimeout(displayBackground, 0800)
    const pokeball = document.getElementById('ball'); 
    pokeball.style.animation = "gameLaunched 0.9s ease-in-out forwards"
    getScore(); 
    getTotal(); 
    restartGame(); 
}

function displayBackground(){
    const bg = document.getElementById('picture');
    bg.style.display = "block"; 
}


function displayButton(randomPokemons) {

    for(i = 0; i < randomPokemons.length; i++){
        let buttonProps = document.createElement('button');
        buttonProps.textContent = randomPokemons[i].name_;
        document.getElementById('props').appendChild(buttonProps); 
        buttonProps.addEventListener('click', () => {
           console.log(buttonProps.textContent); 
           getValue(buttonProps.textContent);
           checkAnswer(localStorage.getItem('valueGiven'), localStorage.getItem('goodAnswer'));
           document.getElementById('poke').style.filter = "brightness(1)"; 
           setTimeout(() => location.reload(), 1000)
           
           
        })

    }
}
fetch('http://localhost:8080/pokemon')
.then((response) => response.json())
.then((response) => {

    const pokemons = shuffleArray(response)
    const randomPokemons = get3Pokemons(pokemons); 
    let goodAnswer = randomPokemons[Math.floor(Math.random() * 3)]; 
    displayButton(randomPokemons);      
    document.getElementById('poke').setAttribute('src', getPokemonImage(goodAnswer.number_))
    localStorage.setItem('goodAnswer', goodAnswer.name_)
    

}); 

function shuffleArray(data){
    const shuffled = data.map(value => ({ value, sort: Math.random() }))
    .sort((a, b) => a.sort - b.sort)
    .map(( { value }) => value); 

    return shuffled
}

function get3Pokemons(shuffledArray){
    return shuffledArray.splice(0, 3)
}


function getPokemonImage(number){
    return `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${number}.png`
}

function getValue(valueGiven){
    localStorage.setItem('valueGiven', valueGiven)
}

function checkAnswer(valueGiven, goodAnswer){
    if(valueGiven === goodAnswer){
        console.log("bon");
        increment(); 
        incrementQuestion(); 
    }else{
        console.log("pas bon");
        incrementQuestion(); 
    }
}


function increment(){
    let score = document.getElementById('score_incrementation'); 
    let value = parseInt(score.textContent);
    value += 1;
    localStorage.setItem('score', value)
    score.innerText = value.toString(); 
}

function incrementQuestion(){
    let score = document.getElementById('total'); 
    let value = parseInt(score.textContent);
    value += 1;
    localStorage.setItem('total', value)
    score.innerText = value.toString();
}

function getScore(){
    let score = document.getElementById('score_incrementation');
    score.textContent = localStorage.getItem('score');   
}

function getTotal(){
    let total = document.getElementById('total');
    total.textContent = localStorage.getItem('total');  
}

function restartGame(){
    document.getElementById('restart').addEventListener('click', () => {
        localStorage.setItem('score', 0);
        localStorage.setItem('total', 0);  
        location.reload();
    })

}

function reload(){
    location.reload();
}