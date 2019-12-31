package classandobject1;

public class lap1 {
	
		 byte lapno;
		 byte throwsMade;
		 String fastestplayer;
		 float fastesttime;
		
		public lap1(byte lapno, byte throwsMade, String fastestplayer, float fastesttime) {
			// TODO Auto-generated constructor stub
			super();
			this.lapno = lapno;
			this.throwsMade = throwsMade;
			this.fastestplayer = fastestplayer;
			this.fastesttime = fastesttime;
		}
		public byte getLapno() {
			return lapno;
		}
		public void setLapno(byte lapno) {
			this.lapno = lapno;
		}
		public byte getThrowsMade() {
			return throwsMade;
		}
		public void setThrowsMade(byte throwsMade) {
			this.throwsMade = throwsMade;
		}
		public String getFastestplayer() {
			return fastestplayer;
		}
		public void setFastestplayer(String fastestplayer) {
			this.fastestplayer = fastestplayer;
		}
		public float getFastesttime() {
			return fastesttime;
		}
		public void setFastesttime(float fastesttime) {
			this.fastesttime = fastesttime;
		}
		
		
		
	}


