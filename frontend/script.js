

fetch('https://pokeapi.co/api/v2/pokemon?limit=151', {
    contentType: 'application/*',
    headers: {
        'Access-Control-Allow-Origin':'*',
        'Access-Control-Allow-Headers':'application/*',
    } 
})
.then((response) => response.json())
.then((response) => {
    let random = Math.random() * (151 - 0) + 0;
    let resultOfRandom = 0; 
    for(i = 0; i < random; i++){
        resultOfRandom = response.results.lastIndexOf(response.results[i]);
    }
    // console.log(response.results[resultOfRandom]); 

    
    const number = getPokemonNumber(response.results[resultOfRandom].url)
    const finalUrl = getPokemonImage(number)
    
    let poke = document.getElementById('poke').setAttribute('src', finalUrl);

    
}); 



function getPokemonImage(number){
    return `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${number}.png`
}

function getPokemonNumber (url){
    const regex = /(\d+)\/$/; 
    return  (url.match(regex) || [])[1]; 
}