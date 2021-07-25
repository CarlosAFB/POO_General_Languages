class Caneta{
 
    constructor(cor, marca, carga, ponta, tampada){
        this.cor = cor
        this.marca = marca
        this.carga = carga
        this.ponta = ponta
        this.tampada = tampada
    }
    
    relatorio(){
        console.log('################') 
        console.log("Cor: "   + this.getCor())
        console.log("Marca: " + this.getMarca())
        console.log("Ponta: " + this.getPonta())
        console.log("Carga: " + this.getCarga())
        console.log("Tampada: " + this.isTampada())
        console.log('################') 
    }
    
    rabiscar(){
        if (this.isTampada())
            console.log("A caneta não pode rabiscar enqaunto estiver tampada...")
        else
            console.log("A caneta está rabiscando...")
    }

    tampar(){
        if (this.isTampada())
            console.log("A caneta já está tampada...")
        else 
            this.setTampada(true)
            console.log("A caneta foi tampada...")
    }

    destampar(){
        if (this.isTampada() == false)
            console.log("A caneta ja está destampada...")
        else
            this.setTampada(false)
            console.log("A caneta foi destampada")
    }

    setCor(cor){
      thiscor = cor
    }
    getCor(){
      return this.cor
    }

    setMarca(marca){
      this.marca = marca
    }
    getMarca(){
        return this.marca
    }
    
    setCarga(carga){
      this.carga = carga
    }
    getCarga(){
        return this.carga
    }
    
    setPonta(ponta){
      this.ponta = ponta
    }
    getPonta(){
        return this.ponta
    }
    
    setTampada(tampada){
      this.tampada = tampada
    }
    isTampada(){
        return this.tampada
    }

}

let c1 = new Caneta('Azul','COMPACTOR', 100, 0.7, true);
c1.relatorio();
