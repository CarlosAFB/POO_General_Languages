function Caneta(){
 
    constructor(cor, marca, carga, ponta, tapada){
        setCor(cor)
        setMarca(marca)
        setPonta(ponta)
        setCarga(carga)
        setTampada(tampada)
    }
    
    relatorio(){
      console.log("Nome: ${this._cor}")
      console.log("Marca: ${this._marca}")
      console.log("Nome: ${this._cor}")
      console.log("Nome: ${this._cor}")
      console.log("Nome: ${this._cor}")
    }
    
    set setCor(cor){
      this._cor = cor
    }
    
    set setMarca(marca){
      this._marca = marca
    }
    
    set setCarga(carga){
      this._carga = carga
    }
    
    set setPonta(ponta){
      this._ponta = ponta
    }
    
    set setTampada(tampada){
      this._tapada = tampada
    }
    
    get cor(){
      return this._cor
    }
}
