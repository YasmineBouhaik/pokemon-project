fetch('http://localhost:8080/pokemon')
.then((response) => response.json())
.then((response) => {

const pokemons = shuffleArray(response);
const randomPokemons = get3Pokemons(pokemons); 
let goodAnswer = randomPokemons[Math.floor(Math.random() * 3)]; 

document.getElementById("name").innerHTML = goodAnswer.name_;

// TON POKEMON BONNE REPONSE
// console.log(goodAnswer)
// SON PREMIER TYPE
console.log("1er type bonne rep", goodAnswer.typepokemon[0].label)
// SON 2E TYPE
// console.log(goodAnswer.typepokemon[1].label)

console.log("array 3 pkm (dont le bon)", randomPokemons)
const poks = []
randomPokemons.forEach ( pokemon => poks.push(pokemon.typepokemon[0].label))
    // console.log("1er type de chaque pkm", pokemon.typepokemon[0].label); 
    // console.log("poks", poks);
    document.getElementById("btn1").innerHTML = poks[0];
    document.getElementById("btn2").innerHTML = poks[1];
    document.getElementById("btn3").innerHTML = poks[2];

// je clique sur un btn qui est === à goodAnswer.etc (le type du pkm)

//quand click sur bonne réponse ou mauvaise
    const btn1 = document.getElementById("btn1")
    btn1.addEventListener("click", function() {
        if (btn1.innerHTML === goodAnswer.typepokemon[0].label) {
            alert("You're the thug one !");
            btn1.style.background = "green";
        } else {
            alert("Try again !");
            btn1.style.background = "red";
        }
    })

    const btn2 = document.getElementById("btn2")
    btn2.addEventListener("click", function() {
        if (btn2.innerHTML === goodAnswer.typepokemon[0].label) {
            alert("You're the thug one !");
            btn2.style.background = "green";
        } else {
            alert("Try again !");
            btn2.style.background = "red";
        }
    })

    const btn3 = document.getElementById("btn3")
    btn3.addEventListener("click", function() {
        if (btn3.innerHTML === goodAnswer.typepokemon[0].label) {
            alert("You're the thug one !");
            btn3.style.background = "green";
        } else {
            alert("Try again !");
            btn3.style.background = "red";
        }
    })
})

function shuffleArray(data){
    const shuffled = data.map(value => ({ value, sort: Math.random() }))
    .sort((a, b) => a.sort - b.sort)
    .map(( { value }) => value); 
    return shuffled
}

function get3Pokemons(shuffledArray){
    return shuffledArray.splice(0, 3)
};


