const nomes = ["ana Julia", "Caio vinicius", "BIA silva"];

//forma 1
const nomesPadronizados = nomes.map((nome) => {
    return nome.toUpperCase();
})

console.log(nomesPadronizados)

console.log('---------------------')

//forma 2
const nomesPadronizados2 = nomes.map((nome) => nome.toLocaleUpperCase());
console.log(nomesPadronizados2);