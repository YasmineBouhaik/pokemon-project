function launchGame(){
    setTimeout(displayBackground, 0800)
    const pokeball = document.getElementById('ball'); 
    pokeball.style.animation = "gameLaunched 0.9s ease-in-out forwards"

}

function displayBackground(){
    const bg = document.getElementById('picture');
    bg.style.display = "block"; 
}

 
fetch('http://localhost:8080/pokemon')
.then((response) => response.json())
.then((response) => {

    const pokemons = shuffleArray(response)
    const randomPokemons = get3Pokemons(pokemons); 
    console.log(randomPokemons);
    console.log(randomPokemons[Math.floor(Math.random() * 3)]);
    
    // let getGoodPokemonIndex = Math.random() * 26;
    // let getRandomPokemonOneIndex = Math.random() * 12;
    // let getRandomPokemonTwoIndex = Math.random() * 8;

    // for(i = 0; i < getGoodPokemonIndex; i++){
    //     const imageUrl = getPokemonImage(response[i].number_);
    //     console.log(getGoodPokemon(response[i].name_)); 
    //     document.getElementById('poke').setAttribute('src', imageUrl);
    // }


    // for(i = 0; i < getRandomPokemonOneIndex; i++){
    //     const imageUrl = getPokemonImage(response[i].number_)
    // }



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
