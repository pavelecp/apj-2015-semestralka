package cz.cvut.fit.pavelpat.apj.semestralka.connection;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Connection {

	private static Connection instance;
	private Socket socket;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	
	public Connection getInstance() {
		if (instance == null) {
			instance = new Connection();
		}
		return instance;
	}
	
	private Connection(){
		
	}
	
	public void connect(InetAddress address, int port) throws IOException {
		socket = new Socket(address, port);
		oos = new ObjectOutputStream(socket.getOutputStream());
		ois = new ObjectInputStream(socket.getInputStream());
	}
	
	public void disconnect() {
//		if (!isConnected()) {
//			return;
//		}
//		try (ObjectOutputStream oos = this.oos;
//                ObjectInputStream ois = this.ois;
//                Socket s = this.socket) {
//            send(new Logout());
//            this.socket = null;
//        } catch (IOException ex) {
//        	ex.printStackTrace();
//        }
	}
	
	public boolean isConnected() {
		return socket != null;
	}
	
}
