package adproc;


public abstract class Pipe {
    private int PipePlasticGrade, Pipecolour;
    private double pipeLength; //length is max 6 metres
    private double pipeOuterRadius;
    private double PiperInnerRadius = pipeOuterRadius * 0.9;
    private Boolean pipeChemicalResist, pipeInsulation, pipeOuterReinforcement;

    public Pipe(Boolean pipeOuterReinforcement, int pipePlasticGrade, int pipecolour, double pipeLength, double pipeOuterRadius, double piperInnerRadius, Boolean pipeChemicalResist, Boolean pipeInsulation) {
        this.pipeOuterReinforcement = pipeOuterReinforcement;
        this.PipePlasticGrade = pipePlasticGrade;
        this.Pipecolour = pipecolour;
        this.pipeLength = pipeLength;
        this.pipeOuterRadius = pipeOuterRadius;
        this.PiperInnerRadius = piperInnerRadius;
        this.pipeChemicalResist = pipeChemicalResist;
        this.pipeInsulation = pipeInsulation;
    }

    public void setPipeOuterRadius(double pipeOuterRadius) {
        this.pipeOuterRadius = pipeOuterRadius;
    }

    public double getPipeOuterRadius() {
        return pipeOuterRadius;
    }

    public double getPipeLength() {
        return pipeLength;
    }
}
