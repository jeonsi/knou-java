/** Class 정의 방법 */

public class Electronics {
    private int nVoltage = 0;

    // nVoltage = 1;   // error: not a field, nor a method

    { nVoltage = 1; }   // 초기화 블력 내부에서는 ok!

    public void turnOn(int nInputVoltage) {
        nVoltage = nInputVoltage;
    }

    public void turnOff() {
        nVoltage = 0;
    }

    public int getVoltage() {
        return nVoltage;
    }
}
