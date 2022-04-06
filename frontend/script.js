
fetch('http://localhost:8080/pokemon')
.then((response) => response.json())
.then((response) => {
    let random = Math.random() * 26 ;
    for(i = 0; i < random; i++){
        const imageUrl = getPokemonImage(response[i].number_)
        document.getElementById('poke').setAttribute('src', imageUrl);
    }
}); 

function getPokemonImage(number){
    return `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${number}.png`
}
