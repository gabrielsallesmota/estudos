class Conta:
    # self é a referencia que sabe encontrar onde esta o objeto criado
    def __init__(self, numero, titular, saldo, limite):
        print("Construindo objeto ... {}".format(self))
        # __ antes de cada atributo é como se fosse o private numero em Java
        self.__numero = numero
        self.__titular = titular
        self.__saldo = saldo
        self.__limite = limite

    def extrato(self):
        print("Saldo de {} do titular {}".format(self.__saldo, self.__titular))

    def deposita(self, valor):
        self.__saldo += valor

    def saca(self, valor):
        self.__saldo -= valor

    def transfere(self, valor, destino):
        self.saca(valor)
        destino.deposita(valor)