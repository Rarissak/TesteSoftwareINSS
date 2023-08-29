public class CalculadoraSalario {


    public double calcularINSS(double salarioBruto){
        double maxValue1 = 99;
        double maxValue2 = 112.62;
        double maxValue3 = 154.28;
        double maxValue4 = 511.07;
      double faixaSalarial1 = salarioBruto * 0.075;
      double faixaSalarial2 = (salarioBruto - 1320.01) * 0.09 + maxValue1;
      double faixaSalarial3 = (salarioBruto - 2571.29) * 0.12 + maxValue1 + maxValue2;
      double faixaSalarial4 = (salarioBruto - 3856.94) * 0.14 + maxValue1 + maxValue2 + maxValue3;
      double salarioAcimaFaixas = maxValue1 + maxValue2 + maxValue3 + maxValue4;

      if (salarioBruto <= 1320.00){
          return faixaSalarial1;
      }else if (salarioBruto >= 1320.01 && salarioBruto <= 2571.29){
          return faixaSalarial2;
      } else if (salarioBruto > 2571.29 && salarioBruto <= 3856.94) {
          return faixaSalarial3;
      } else if (salarioBruto > 3856.94 && salarioBruto <=7507.49) {
          return faixaSalarial4;
      } else {
          return salarioAcimaFaixas;
      }


    }

}
