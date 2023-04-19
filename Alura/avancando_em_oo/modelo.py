# REFORÇANDO: Nome da classe sempre com a primeira maiúscula
class Programa:
    def __init__(self, nome, ano):
        # .title() muda todas as primeiras para maiúscula
        # um _ só ele nao muda o nome, porém ele também deixa ela protegida por convenção
        self._nome = nome.title()
        self.ano = ano
        self._likes = 0

    @property
    def likes(self):
        return self._likes

    def dar_like(self):
        self._likes += 1

    @property
    def nome(self):
        return self._nome

    @nome.setter
    def nome(self, nome):
        self._nome = nome

    def __str__(self):
        return f'Nome: {self._nome} - Ano: {self.ano} - Likes: {self._likes}'


class Filme(Programa):
    def __init__(self, nome, ano, duracao):
        self._nome = nome.title()
        self.ano = ano
        self.duracao = duracao
        self._likes = 0

    def __str__(self):
        return f'Nome: {self._nome} - Ano: {self.ano} - Duracao: {self.duracao}min - Likes: {self._likes}'


class Serie(Programa):
    def __init__(self, nome, ano, temporadas):
        self._nome = nome.title()
        self.ano = ano
        self.temporadas = temporadas
        self._likes = 0

    def __str__(self):
        return f'Nome: {self._nome} - Ano: {self.ano} - Temporadas: {self.temporadas} - Likes: {self._likes}'


vingadores = Filme('vingadores - guerra infinita', 2018, 160)
atlanta = Serie('atlanta', 2018, 2)
shrek = Filme('shrek 2', 2009, 90)
breaking_bad = Serie('Breaking Bad', 2008, 7)

vingadores.dar_like()
vingadores.dar_like()
shrek.dar_like()
atlanta.dar_like()
atlanta.dar_like()
atlanta.dar_like()
breaking_bad.dar_like()


class Playlist:
    def __init__(self, nome, programas):
        self.nome = nome
        self._programas = programas

    ##__getitem__ é um ducktyping, ele faz apenas o comportamento de sequencia
    def __getitem__(self, item):
        return self._programas[item]

    @property
    def listagem(self):
        return self._programas

    ##__len__ ele retorna o tamanho da lista programas
    def __len__(self):
        return len(self._programas)


filmes_e_series = [vingadores, atlanta, shrek, breaking_bad]
playlist_fim_de_semana = Playlist('Fim de Semana', filmes_e_series)

print(f'Tamanho do playlist: {len(playlist_fim_de_semana)}')

# polimorfismo: como as duas pertences a mesma superclasse é possivel criar um for para percorrer
for programa in playlist_fim_de_semana.listagem:
    print(programa)
