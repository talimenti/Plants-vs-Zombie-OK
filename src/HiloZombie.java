import javax.swing.JLabel;


public class HiloZombie extends Thread{
	//ATRIBUTOS DE INSTANCIA
	protected Zombie zombie;
	protected Juego juego;
	
	//CONSTRUCTOR
	public HiloZombie(Juego j,Zombie z){
		zombie=z;juego=j;
	}
	
	//COMANDOS
	public void run(){
<<<<<<< .mine
<<<<<<< .mine
		zombie.bloquearZombie();
		while(zombie.getPosX()>0){
=======
	//	zombie.bloquearZombie();
=======
>>>>>>> .r49
		while(juego.sigueJuego()){
>>>>>>> .r45
			zombie.setX(zombie.getPosX()-zombie.getVelocidad());
<<<<<<< .mine
			if(zombie.getPosX()%100==0)
				zombie.avanzar();
=======
			if(zombie.getPosX()%100==0)
				zombie.avanzar();
			if(!zombie.usoAtaqueEspecial())
				zombie.ataqueEspecial();
			if(zombie.getPosX()<-10)
				juego.setSigueJuego(false);
>>>>>>> .r45
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}}
	}

}
