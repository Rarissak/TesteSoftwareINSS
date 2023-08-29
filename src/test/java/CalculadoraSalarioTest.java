import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CalculadoraSalarioTest {

    CalculadoraSalario cs = new CalculadoraSalario();
    @Test
    @DisplayName("verificando descontos do salário bruto 1")
    public void testFaixaSalarial1CT01(){
        assertEquals(97.50, cs.calcularINSS(1300), 0.01);
    }
    @Test
    @DisplayName("verificando descontos do salário bruto 2")
    public void testFaixaSalarial1CT02(){
        assertEquals(115.20, cs.calcularINSS(1500), 0.01);
    }
    @Test
    @DisplayName("verificando descontos do salário bruto 3")
    public void testFaixaSalarial1CT03(){
        assertEquals(263.06, cs.calcularINSS(3000), 0.01);
    }
    @Test
    @DisplayName("verificando descontos do salário bruto 4")
    public void testFaixaSalarial1CT04(){
        assertEquals(665.92, cs.calcularINSS(6000), 0.01);
    }
    @Test
    @DisplayName("verificando descontos do salário bruto 5")
    public void testFaixaSalarial1CT05(){
        assertEquals(876.97, cs.calcularINSS(12000), 0.01);
    }

}