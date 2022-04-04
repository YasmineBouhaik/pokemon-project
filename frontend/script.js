

fetch('https://pokeapi.co/api/v2/pokemon?limit=25')
.then((response) => response.json())
.then((response) => {

    let random = Math.random() * (25 - 0) + 0;
    let resultOfRandom = 0; 

    for(i = 0; i < random; i++){
        resultOfRandom = response.results.lastIndexOf(response.results[i]);
    }

    
    const number = getPokemonNumber(response.results[resultOfRandom].url)
    const finalUrl = getPokemonImage(number)
    console.log(getPokemonImage(number));
    console.log(response.results.url);
    console.log(response.results[resultOfRandom]);
    
    let poke = document.getElementById('poke').setAttribute('src', finalUrl);

    
}); 



function getPokemonImage(number){
    return `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${number}.png`
}

function getPokemonNumber (url){
    const regex = /(\d+)\/$/; 
    return  (url.match(regex) || [])[1]; 
}