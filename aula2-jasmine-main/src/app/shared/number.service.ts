import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class NumberService {

  private arrayNumber = [1, 2, 3];
  private arrayData: Date[] = [];

  getName(): string {
    return "Gilmar Bennert";
  }

  getArrayNumber(): Number[] {
    return this.arrayNumber;
  }

  getStatus(status: boolean): boolean {
    return status;
  }

  getRandom(): number {
    //return Math.floor(Math.random() * 5) + 1;
    return 3;
  }

  getMesmoMes(data: Date): boolean {
    return data.getMonth() === new Date().getMonth();
  }


  adicionarData(data: Date): void {
    this.arrayData.push(data);
  }

  getTamanhoArray(): number {
    return this.arrayData.length;
  }

  
}
