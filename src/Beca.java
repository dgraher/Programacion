public class Beca {
    static int beca_mínima=0;
    static int smi=750;
    static double renta_mínima=780;
    static double renta_máxima=2400;
     
	public static int calcularBeca(double rentaFamiliar) throws RuntimeException {
		int beca;

		if (rentaFamiliar < 10) {
			throw new RuntimeException("Renta incorrecta es esta hola hola hola");
		} else {

			if (rentaFamiliar < renta_mínima) {
				beca = 3*smi;
			} else {
				if (rentaFamiliar < ((renta_mínima+renta_máxima)/2)) {
					beca = 2*smi;
				} else {
					if (rentaFamiliar < renta_máxima) {
						beca = smi;
					} else {
						beca = beca_mínima;
					}
				}
			}
		}

		return beca;
	}
}
