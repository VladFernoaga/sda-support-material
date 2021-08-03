package ro.unitbv.inheritance;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class InheritanceExamples {

	public static void main(String[] args) {

		// Colecteaz-mi toti senzonrii disponibili in sistem si afiseaza intr-un
		// raport toate grupurile de (nume - valoare)

//		List<HumiditySenzor> humSenzors = Arrays.asList(new HumiditySenzor("34"), new HumiditySenzor("34"),
//				new HumiditySenzor("34"), new HumiditySenzor("34"));
//
//		List<LightSenzor> lightSenzors = Arrays.asList(new LightSenzor("342"), new LightSenzor("341"),
//				new LightSenzor("343"), new LightSenzor("343"));
//
//		for (HumiditySenzor hm : humSenzors) {
//			System.out.println(hm.getName() + " - " + hm.getValue());
//		}
//
//		for (LightSenzor li : lightSenzors) {
//			System.out.println(li.getName() + " - " + li.getValue());
//		}

		// Mostenire - pentru a unifica interfata de access

		List<Senzor> senzors = Arrays.asList(new HumiditySenzor("34"), new HumiditySenzor("34"), new LightSenzor("343"),
				new LightSenzor("343"), new TemperatureSenzor("21.2"), new HumiditySenzor("34"),
				new TemperatureSenzor("36"));
		
		for(Senzor s: senzors) {
			System.out.println(s.getName() + " - " + s.getValue());
		}
		
		// Initializarea cu compozitie
		MasinaPrinCompozitie masinaElectrica = new MasinaPrinCompozitie(new MotorElectric("", ""));
		MasinaPrinCompozitie masinaHibrida =   new MasinaPrinCompozitie(new MotorHibrid("", ""));

		// Initializarea cu compozitie + factory
		MasinaPrinCompozitie2 masinaElectrica2 = MasinaPrinCompozitie2.electicFactory();
		MasinaPrinCompozitie2 masinaHibrida2 = MasinaPrinCompozitie2.hibridFactory();
	}

}

// Mostenire si Compozitie 
// - definirea (crearea) unei relatii intre 2 obiecte 

class General {

}

// Definim o relatie de mostenire
// O relatie de tipul is-a
class Specific extends General {

}

class Engine {

}

class Car {
	// Compozitie
	// O relatie de tipul has-a
	Engine engine;
}

// Proprietatile mostenirii 

// - obiectul de baza preia comportamentul obiectului parinte
// - nu mostenim pentru a prelua atributele uni abiect si comportamentul 
//

class Senzor {
	private String id;
	private String name;
	private String value;

	public Senzor(String id, String name, String value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}
}

class HumiditySenzor extends Senzor {
	private static final String NAME = "Humidity";

	public HumiditySenzor(String value) {
		super(UUID.randomUUID().toString(), NAME, value);
		localSetup();
	}

	private void localSetup() {
		System.out.println("Local setup");
	}
}

class TemperatureSenzor extends Senzor {
	private static final String NAME = "Temperature";

	public TemperatureSenzor(String value) {
		super(UUID.randomUUID().toString(), NAME, value);
		localSetup();
	}

	private void localSetup() {
		System.out.println("Local setup");
	}
}

class LightSenzor extends Senzor {
	private static final String NAME = "Light";

	public LightSenzor(String value) {
		super(UUID.randomUUID().toString(), NAME, value);
		localSetup();
	}

	private void localSetup() {
		System.out.println("Local setup");
	}
}



class Motor{

	private String putere;
	private String marcaMotor;
	
	public String getPutere() {
		return putere;
	}
	public String getMarcaMotor() {
		return marcaMotor;
	}
	public Motor(String putere, String marca) {
		super();
		this.putere = putere;
		this.marcaMotor = marca;
	}
	
}

class MotorElectric extends Motor{

	private String type ="Electric";
	public MotorElectric(String putere, String marca) {
		super(putere, marca);
	}	
}

class MotorHibrid extends Motor{
	public MotorHibrid(String putere, String marca) {
		super(putere, marca);
	}
}

//ASA NU
class MasinaClasica extends Motor{
	public MasinaClasica(String putere, String marcaMotor) {
		super(putere, marcaMotor);
	}	
	
	public void driveAssist() {
		System.out.println("Drive Assist");
	}
}

class MasinaElectica extends MotorElectric{

	public MasinaElectica(String putere, String marca) {
		super(putere, marca);
	}
	
	public void driveAssist() {
		System.out.println("Drive Assist");
	}
}

class MasinaHibirda extends MotorHibrid{
	public MasinaHibirda(String putere, String marca) {
		super(putere, marca);
	}
	
	public void driveAssist() {
		System.out.println("Drive Assist");
	}
}

// ASA DA - folosim compozitia


class MasinaPrinCompozitie{
	
	// Relatie de tip Has-A
	private Motor motor;
	
	public MasinaPrinCompozitie(Motor motor) {
		super();
		this.motor = motor;
	}
	public void driveAssist() {
		System.out.println("Drive Assist");
	}
		
}

// Conceptul de factory

class MasinaPrinCompozitie2{
	
	// Relatie de tip Has-A
	private Motor motor;
	
	private MasinaPrinCompozitie2(Motor motor) {
		super();
		this.motor = motor;
	}
	public void driveAssist() {
		System.out.println("Drive Assist");
	}
		
	public static MasinaPrinCompozitie2 electicFactory() {
		return new MasinaPrinCompozitie2(new  MotorElectric("",""));
	}
	
	public static MasinaPrinCompozitie2 hibridFactory() {
		return new MasinaPrinCompozitie2(new  MotorHibrid("",""));
	}
}
