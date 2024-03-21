const nomes = ["Evaldo", "Mari", "Camis"];

//modo tradicional
nomes.forEach(function(nome){
    console.log(nome);
});

//com arrow function
nomes.forEach((nome) => {
    console.log(nome);
});

//função callback de forma externa
function imprimeNome(nome){
    console.log(nome);
}

nomes.forEach(imprimeNome);