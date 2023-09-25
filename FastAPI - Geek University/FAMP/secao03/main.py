from fastapi import FastAPI 
from fastapi import HTTPException
from fastapi import status
from typing import List, Optional
from models import Curso

app = FastAPI()

cursos = {
    1: {
        "titulo":"Programação",
        "aulas":100,
        "horas":58
    },
    2:{
        "titulo": "Algoritmos",
        "aulas": 80,
        "horas":60
    }
}

@app.get('/cursos')
async def get_cursos():
    return cursos

@app.get('/cursos/{curso_id}') 
async def get_curso(curso_id:int):
    try:
        curso = cursos [curso_id]
        return curso
    except KeyError:
        raise HTTPException(
            status_code=status.HTTP_404_NOT_FOUND, detail='Curso não encontrado.')

@app.post('/cursos', status_code=status.HTTP_201_CREATED)
async def post_curso(curso: Curso):
    next_id: int = len(cursos) + 1
    cursos[next_id] = curso
    del curso.id
    return curso  


@app.put('/cursos/{curso_id}')
async def put_curso(curso_id: int, curso: Curso):
    if curso_id in cursos:
        cursos[curso_id] = curso
        del curso.id
        return curso
    else:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, 
                            detail=f'Não existe um curso com id {curso_id}')

if __name__ == '__main__':
    import uvicorn 
    uvicorn.run("main:app", host="127.0.0.1", port=8000, reload=True)

