export class Caneta1{
//export é usado para usar a classe em outros lugares
        private cor: string;
        private marca: string;
        private carga: number;
        private ponta: number;
        private tampada: boolean;
        //readonly não permite alterar campo, (Usado em variaveis contantes. Ex. readonly pi: mumber)

    constructor(cor:string, marca:string, carga:number, ponta:number, tampada:boolean){
        this.cor = cor;
        this.marca = marca;
        this.carga = carga;
        this.ponta = ponta;
        this.tampada = tampada;
    }

    relatorio() : void{
        console.log('###############')    
        console.log("Cor: "   + this.getCor());
        console.log("Marca: " + this.getMarca());
        console.log("Ponta: " + this.getPonta());
        console.log("Carga: " + this.getCarga());
        console.log("Tampada: " + this.isTampada());
        console.log('###############')
    }

    rabiscar() : void{
        if(this.isTampada() == true)
            console.log("A caneta não pode rabiscar enquanto estiver tampada...");
        else
            console.log("A caneta está rabiscando...");
    }

    tampar() : void{
        if (this.isTampada())
            console.log("A caneta já está tampada...");
        else 
            this.setTampada(true);
            console.log("A caneta foi tampada...");
    }
    destampar() : void{
        if (this.isTampada() == false)
            console.log("A caneta ja está destampada...");
        else
            this.setTampada(false)
            console.log("A caneta foi destampada...");
    }

    setCor(cor:string){
        this.cor = cor;
      }
    getCor(){
        return this.cor;
    }
  
    setMarca(marca:string){
        this.marca = marca;
    }
    getMarca(){
          return this.marca;
    }
      
    setCarga(carga:number){
        this.carga = carga;
    }
    getCarga(){
          return this.carga;
    }
      
    setPonta(ponta:number){
        this.ponta = ponta;
    }
    getPonta(){
          return this.ponta;
    }
      
    setTampada(tampada:boolean){
        this.tampada = tampada;
    }
    isTampada(){
          return this.tampada;
    }
    
}

const c1 = new Caneta1('Azul','BIC',60, 0.5, true);
c1.relatorio();

c1.rabiscar();
c1.destampar();
c1.rabiscar();
