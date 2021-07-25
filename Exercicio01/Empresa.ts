
export class Empresa{

    public readonly nome: string;
    private readonly colaboradores: Colaborador[] = [];
    protected readonly cnpj: string;

    constructor(nome: string, cnpj:string){
        this.nome = nome;
        this.cnpj = cnpj;
    }

    adicionaColaborarodor(colaborador:Colaborador): void{
        this.colaboradores.push(colaborador)
    }

    relatorio(): void{
        for (const colaborador of this.colaboradores)
        console.log(colaborador);  
    }

}

export class Colaborador{
    constructor(public readonly nome:string, public readonly sobrenome:string){}
}

const e1 = new Empresa('Alura', '0022245-3/12');
const co1 = new Colaborador('Pedro', 'Souza');
const co2 = new Colaborador('Laís', 'Silva');
const co3 = new Colaborador('Pietra', 'Sampaio');

e1.adicionaColaborarodor(co1);
e1.adicionaColaborarodor(co2);
e1.adicionaColaborarodor(co3);

console.log(e1)
e1.relatorio();