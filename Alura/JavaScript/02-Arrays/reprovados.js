const alunos = ["Ana", "Marcos", "Maria", "Mauro"];
const medias = [7, 4.5, 8, 7.5];

//metodo filter serve para filtrar elementos das listas
    //sempre retorna true ou false
    //se usar _ , significa que não está utilizando o parametro que no caso é alunos
const reprovados = alunos.filter((_, indice) => {
    return medias[indice] < 7;
});

console.log(reprovados);