import { NumberService } from "./number.service";

describe(NumberService.name, () => {
  let numberService: NumberService;

  beforeEach(() => {
    numberService = new NumberService();
  })

  //toEqual
  it(`#${NumberService.prototype.getName.name} deve retonar meu nome completo quando invocado a função`, () => {
    const name = numberService.getName();
    expect(name).toEqual("Gilmar Bennert");
  });

  //toEquals
  it(`#${NumberService.prototype.getArrayNumber.name} deve retorar verdadeiro quando os valores do array forem os mesmos!`, () => {
    const array = numberService.getArrayNumber();
    expect(array).toEqual([1, 2, 3]);
  });

  //toBe
  it(`#${NumberService.prototype.getArrayNumber.name} deve retorar verdadeiro quando o objeto do array for o mesmo!`, () => {
    const array = numberService.getArrayNumber();
    expect(array).toBe(numberService.getArrayNumber());
  });

  //toBeTruthy
  it(`#${NumberService.prototype.getStatus.name} deve ser positivo quando status for verdadeiro`, () => {
    expect(numberService.getStatus(true)).toBeTruthy();
  });

  //toBeFalsy
  it(`#${NumberService.prototype.getStatus.name} deve ser positivo quando status for negativo`, () => {
    expect(numberService.getStatus(false)).toBeFalsy();
  });
  
  //not
  it(`#${NumberService.prototype.getStatus.name} deve ser positivo quando o nome for diferente`, () => {
    const name = numberService.getName();
   expect(name).not.toEqual("Gilmar Bennert 2");
  });

  it(`#${NumberService.prototype.getArrayNumber.name} deve conter o numero 1 quando informado`, () => {
    expect(numberService.getArrayNumber()).toContain(1);
  });

  it(`#${NumberService.prototype.getArrayNumber.name} NÃO deve conter o numero 15 quando informado`, () => {
    expect(numberService.getArrayNumber()).not.toContain(15);
  });

  it(`#${NumberService.prototype.getName.name} deve conter a letra "A" no nome quando efetuado a verificação`, () => {
    expect(numberService.getName()).toContain("a");
  });

  it(`#${NumberService.prototype.getName.name} deve existir quando verificado se a variavel existe!`, () => {
    expect(numberService.getName()).toBeDefined();
  });

  it(`#undefined não deve existir quando verificado se a variavel existe!`, () => {
    expect(undefined).toBeUndefined();
  });

  it(`#null deve retornar positivo quando verificado se a variavel esteja null!`, () => {
    expect(null).toBeNull();
  });

  it(`#${NumberService.prototype.getName.name} deve retornar positivo quando convertido o nome para number!`, () => {
    expect(Number(numberService.getName())).toBeNaN();
  });

  it(`#${NumberService.prototype.getRandom.name} deve retornar positivo quando valor for maior ou igual a 2!`, () => {
    expect(numberService.getRandom()).toBeGreaterThanOrEqual(2);
  });

  it(`#${NumberService.prototype.getRandom.name} deve retornar positivo quando valor for menor ou igual a 5!`, () => {
    expect(numberService.getRandom()).toBeLessThanOrEqual(5);
  });

  it(`#${NumberService.prototype.getName.name} deve retornar positivo quando houver sucesso na expressão!`, () => {
    expect(numberService.getName()).toMatch(/lma/);
  });

  it (`#${NumberService.prototype.getMesmoMes.name} deve retornar positivo quando for informado o mesmo mês`, () => {
    const data1 = new Date('2022-07-01 00:00:00');
    expect(numberService.getMesmoMes(data1)).toBeTrue();
  })

  it (`#${NumberService.prototype.getMesmoMes.name} deve retornar positivo quando não for informado o mesmo mês`, () => {
    const data1 = new Date('2022-01-01 00:00:00');
    expect(numberService.getMesmoMes(data1)).not.toBeTrue();
  })


  it (`#${NumberService.prototype.getTamanhoArray.name} deve retornar apenas 1 quando adicionado uma data!`, () => {
    const data1 = new Date('2022-01-01 00:00:00');
    numberService.adicionarData(data1);
    expect(numberService.getTamanhoArray()).toEqual(1);
  });

  it (`#${NumberService.prototype.getTamanhoArray.name} deve retornar 2 quando adicionado duas data!`, () => {
    const data1 = new Date('2022-01-01 00:00:00');
    const data2 = new Date('2022-01-15 00:00:00');
    numberService.adicionarData(data1);
    numberService.adicionarData(data2);
    expect(numberService.getTamanhoArray()).toEqual(2);
  });
  



});