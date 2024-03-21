const alunos = ['João', 'Juliana', 'Ana', 'Caio', 'Lara', 'Marjorie', 'Guilherme', 'Aline', 'Fabiana', 'Andre', 'Carlos', 'Paulo', 'Bia', 'Vivian', 'Isabela', 'Vinícius', 'Renan', 'Renata', 'Daisy', 'Camilo']

//slice é fatiar ou dividir porém ele nao altera o original, cria um novo array
const sala1 = alunos.slice(0,10);
console.log(sala1)

    //se nao colocar valor final ele considera que é até o ultimo da lista
const sala2 = alunos.slice(10);
console.log(sala2)

