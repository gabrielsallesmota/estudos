class Conta:
    # self é a referencia que sabe encontrar onde esta o objeto criado
    #construtor já define os atributos (java tem que declarar a parte)
    def __init__(self, numero, titular, saldo, limite):
        print("Construindo objeto ... {}".format(self))
        # __ antes de cada atributo é como se fosse o private numero em Java
        self.__numero = numero
        self.__titular = titular
        self.__saldo = saldo
        self.__limite = limite

    #metodos
    def extrato(self):
        print("Saldo de {} do titular {}".format(self.__saldo, self.__titular))

    def deposita(self, valor):
        self.__saldo += valor

    #__ antes do nome da função determina que a função só poderá ser acessada dentro da classe
    def __pode_sacar(self, valor_a_sacar):
        valor_disponivel_a_sacar = self.__saldo + self.__limite
        return valor_a_sacar <= (valor_disponivel_a_sacar)

    def saca(self, valor):
        if(self.pode_sacar(valor)):
            self.__saldo -= valor
        else:
            print("O valor {} passou o limite!".format(valor))

    def transfere(self, valor, destino):
        self.saca(valor)
        destino.deposita(valor)

    @property
    def saldo(self):
        return self.__saldo

    @property
    def titular(self):
        return self.__titular

    #forma mais "elegante" de escrever um getter e setter
    @property
    def limite(self):
        return self.__limite
    @limite.setter
    def limite(self, limite):
        self.__limite = limite

    #@staticmethod configura o metodo sendo estático e nao mais propriedade da classe4
    @staticmethod
    def codigo_banco():
        return '001'
+
    @staticmethod
    def codigos_bancos():
        return {'BB':'001', 'Caixa':'104', 'Itau':'341'}