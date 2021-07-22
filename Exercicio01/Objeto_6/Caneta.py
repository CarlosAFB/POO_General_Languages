class Caneta:
#--------- Metodo Inicializador ---------#
    def __init__(self, cor, marca, carga, ponta, tampada):
        self.cor = str(cor)
        self.marca = str(marca)
        self.carga = float(carga)
        self.ponta = float(ponta)
        self.tampada = bool(tampada)

#----------------- Relatorio -------------------#
    def relatorio():
        print(f"#" * 30)
        print(f"Cor da caneta: ")
        print(f"Marca: ")
        print(f"Carga: ")
        print(f"Ponta: ")
        print(f"Tampada: ")
        print("#" * 30)

#-------------- Metodos Especiais --------------#
    def rabiscar(self):
        if self.tampada:
            print("A caneta não pode rabiscar enquanto estiver tampada!")
        else:
            print("A caneta está rabiscando!")
    
    def tampar(self):
        if self.tampada:
            print("A caneta já está tapada!")
        else:
            print("A caneta foi tapada!")

    def destampar(self):
        if self.tampada == False:
            print("A caneta já está destampada!")
        else:
            print("A caneta foi destampada!")

#-------------- Metodos Acessores --------------#

