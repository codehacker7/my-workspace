import java.io.*;
public class Q2 {

	public static void main(String[] args) {
		
        
	}
	
	public static long backup(String filename, double partSize) {

		System.out.println("Backup going on"); //displays the running message

		long time = System.currentTimeMillis(); //counts the time for executing the method

		File f = new File(filename); //creates a new file object based on the filename
		long sizeMB = 0; //gives the total size of the given file
		boolean executable = false;

		if(f.exists()) { //ensures the file exists before starting the operation
			sizeMB = f.length()/1000000;
			executable = true;
		}


		int number = (int) Math.ceil(sizeMB/partSize); //gives the number of files that is to be created

		if(number<1) {
			number = 1;
		}

		int start = 1;
		int i = 1;

		if(executable) {
			while(start<=number) {

				String file = f.getName() + i; //gives the name of the file serially at the start of each loop

				File fi = new File(file); //creates new file parts based on the new name

				try(FileInputStream in = new FileInputStream(filename)){ 
					try(FileOutputStream out = new FileOutputStream(fi)){

						try {
							for(int k = 0; k<partSize*1000000; k++) { //this loop ensures that the loop runs upto the specified filesize
								out.write(in.read());
							}
						}catch(Exception e) {
							int size = in.available();

							for(int j = 0; j<size; j++) { //ensures the remaining bytes is written in the existing file
								out.write(in.read());
							}
						}


					}catch(Exception e) {
						System.out.println("Cannot write the file for some reason");
					}}catch(Exception e) {
						System.out.println("Cannot read the file for some reason");
					}


				start++;
				i++;
			}
		}else {
			System.out.println("The file does not exist");
		}
        
		//Displays message and the total time taken for execution
		System.out.println("Backup done");
		System.out.println("The time for executing: " + time +" milliseconds");
		return start-1;

	}

	public static int restore(String filename, int numberOfPieces) {

		//Displays the starting message and the time
		System.out.println("Restoring Starts");

		long time = System.currentTimeMillis();

		//ensures that the files exist and the number of files exist before starting operation
		File f = new File(filename);

		boolean executable = false;

		if(f.exists()) {
			executable = true;
		}

		//ensures that the files where the files is to be written exists before operating on it
		for(int i = 0; i<numberOfPieces; i++) {
			File fi = new File(f.getName()+(i+1));
			if(fi.exists()) {
				executable = true;
			}else {
				executable = false;
			}
		}

		if(executable) {

			for(int i = 0; i<numberOfPieces; i++) {
				File fi = new File(f.getName()+(i+1));
                int size = (int)fi.length();
				
                //Ensures the newly created files is not overwritten
				try(FileOutputStream out = new FileOutputStream(filename, true)){


					try(FileInputStream in = new FileInputStream(fi)){
                        
						//loop runs unil the end of each small files, then it grabs another file and runs again and again until the encoding is finished and a big file is got
						for(int k = 0; k<size; k++) {
							out.write(in.read());
						}
						
					}catch(Exception e) {
						System.out.println("Cannot read the file for some reason");
					}


				}catch(Exception e) {
					System.out.println("Cannot write the file for some reason");
				}
    

			}

		}

		//displays message, time taken and the filesize
		System.out.println("Restoring done");
		System.out.println("Executed in: " + time + " milliseconds");
		System.out.println(f.getAbsolutePath());
		return (int)f.length()/1000000;


}}