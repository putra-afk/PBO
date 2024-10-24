package Task;

class Segitiga {
    int sudut = 180;

    // Overloaded method to calculate the remaining angle when one angle is known
    public int totalSudut(int sudutA) {
        return sudut - sudutA;
    }

    // Overloaded method to calculate the remaining angle when two angles are known
    public int totalSudut(int sudutA, int sudutB) {
        return sudut - (sudutA + sudutB);
    }

    // Overloaded method to calculate the perimeter of a triangle with three known sides (int version)
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Overloaded method to calculate the perimeter of a right triangle using Pythagorean theorem (double version)
    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }
}
