import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.List;

import javax.swing.JOptionPane;







/**
 * 
 */

/**
 * @author bdame
 *
 */

/*
 * 
//class Base {}
//class Derived extends Base {}
//class Being {
//	public Being() {
//		System.out.println("Being is created");
//	}
//	
//}
//class Human extends Being {
//	public Human() {
//		System.out.println("Human is created");
//	}
//}*/
///*
//class Personne{
//	private String nom;
//	private String prenom;
//	private int age;
//	
//	public static final int NOMBRE_MAX_OREILLES =2;
//	
//	public static int nombreTotalDePersonne = 0;
//
//	public Personne(String nom, String prenom, int age) {
//		super();
//		this.nom = nom;
//		this.prenom = prenom;
//		this.age = age;
//		nombreTotalDePersonne++;
//	}
//
//	public static int getNombreTotalDePersonne() {
//		return nombreTotalDePersonne;
//	}
//
//	public static void setNombreTotalDePersonne(int nombreTotalDePersonne) {
//		Personne.nombreTotalDePersonne = nombreTotalDePersonne;
//	}
//
//	public String getNom() {
//		return nom;
//	}
//
//	public void setNom(String nom) {
//		this.nom = nom;
//	}
//
//	public String getPrenom() {
//		return prenom;
//	}
//
//	public void setPrenom(String prenom) {
//		this.prenom = prenom;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		if (age > 15) {
//			this.age = age;	
//		}else {
//			//System.out.println("Interdit au moins de 15 ans");
//			throw new IllegalArgumentException("L'age doit etre superieur a 15 ans !");
//		}
//	}
//
//	public static int getNombreMaxOreilles() {
//		return NOMBRE_MAX_OREILLES;
//	}
//	
//	public String full_name(String str) {
//		//return nom + " " + prenom;
//		return String.format("%s %s %s", str,  nom, prenom);
//	}
//	
//	public String full_name() {
//		//return nom + " " + prenom;
//		return String.format("%s %s", nom, prenom);
//	}
//
//}
//*/
//public class Exemple {
//
//	/**
//	 * @param args
//	 */
//	//@SuppressWarnings("ResultOfObjectAllocationIgnored")
//	public static void main(String[] args) throws IOException{
//		// TODO Stub de la méthode généré automatiquement
//
//		/*
//		 * 
//		 * * BigInteger
//		System.out.println(Long.MAX_VALUE);
//		
//		BigInteger b = new BigInteger("25632158963252539124");
//		BigInteger c = new BigInteger("96332157962545255120");
//		
//		BigInteger a = b.multiply(c);
//		
//		System.out.println(a);
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * * UsingUnderscore 
//		long a = 85632153353L;
//		long b = 85_632_153_353L;
//		
//		System.out.println(a == b);
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * * Switch
//		System.out.println("Enter a domain :");
//		
//		Scanner clavier = new Scanner(System.in);
//		String domain = clavier.nextLine();
//		
//		domain = domain.trim().toLowerCase();
//		
//		switch(domain) {
//			case "us" :
//				System.out.println("United States");
//				break;
//			case "de" :
//				System.out.println("Germany");
//				break;
//			case "sk" :
//				System.out.println("Slovakie");
//				break;
//			case "hu" :
//				System.out.println("Hungary");
//				break;
//			default :
//				System.out.println("Unknown");
//				break;
//		}
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * * SimpleGui
//
//		JOptionPane.showMessageDialog(null, "Swing Gui");
//		 */
//		
//		/*--------------------------------------------------------*/
//		/*
//		 * * ScientificNotation
//		double n = 1.2536489;
//		DecimalFormat dec = new DecimalFormat("#.00");
//		
//		System.out.println(dec.format(n));
//		
//		BigDecimal bd = new BigDecimal("1.235e-16");
//		
//		System.out.println(bd.toEngineeringString());
//		System.out.println(bd.toPlainString());
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * 
//		 * * ReadWEbPage
//		 webPage = "http://www.google.com";
//		String html = Jsoup.connect(webPage).get().html();
//		System.out.println(html);
//		*/
//		
//		/*--------------------------------------------------------*/
//		/*
//		 * * MethodeArguments
//		System.out.println("Argument :" +args[0]);
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * 
//		 * *LIterals
//		int age = 28;
//		String name = "Mamadou";
//		Random r = new Random();
//		boolean sng = r.nextBoolean();
//		String job = null;
//		double weight = 73.05;
//		char c = 'm';
//		
//		System.out.format("My name is %s%n", name);
//		System.out.format("I am %d years old%n", age);
//		
//		if(sng) {
//			System.out.println("I am single");
//		}else {
//			System.out.println("I am in a relationship");
//		}
//		
//		System.out.format("My job is %s%n", job);
//		System.out.format("I weight %f kilograms%n", weight);
//		System.out.format("My name begins with %c%n", c);
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * * ForStatement
//		 Random r = new Random();
//		 
//		 int[] values = new int[10];
//		 int num;
//		 int sum = 0;
//		 
//		 for(int i = 0; i < 10; ++i, sum += num) {
//			 num = r.nextInt(10);
//			 values[i] = num;
//		 }
//		 
//		 System.out.println(Arrays.toString(values));
//		 System.out.println("The sum of the values is " +sum);
//		 */
//		/*--------------------------------------------------------*/
//		/*
//		 * * Enumeratio
//		enum Days {
//			LUNDI,
//			MARDI,
//			MERCREDI,
//			JEUDI,
//			VENDREDI,
//			SAMEDI,
//			DIMANCHE
//		}
//		public static void main(String[] args){
//			Days day = Days.LUNDI;
//			
//			if(day == Days.LUNDI) System.out.println("On est lundi");
//			System.out.println(day);
//			for (Days d : Days.values()) {
//				System.out.println(d);
//			}
//		}
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * ContinueStatement
//		int num = 0;
//		while (num < 100) {
//			++num;
//			
//			if ((num % 2 == 0)) {
//				continue;
//			}else if (num == 51){
//				break;
//			}
//			System.out.println(num + " ");
//		}
//		System.out.println('\n');
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * * Fortmat
//		System.out.println(1);
//		System.out.println(12);
//		System.out.println(123);
//		System.out.println(1234);
//		System.out.println(12345);
//		System.out.println(123456);
//		
//		System.out.format("%10d%n", 1);
//		System.out.format("%10d%n", 12);
//		System.out.format("%10d%n", 123);
//		System.out.format("%10d%n", 1234);
//		System.out.format("%10d%n", 12345);
//		System.out.format("%10d%n", 123456);
//		
//		System.out.format("%d%n", 12355);
//		System.out.format("%o%n", 12364);
//		System.out.format("%x%n", 12325);
//		System.out.format("%e%n", 0.0221234);
//		System.out.format("%d%%%n", 45);
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * TabMultiDim
//		int[][] twoDim = new int[][] {{1,2,3},{3,2,1}};
//		
//		int c = twoDim.length;
//		int l = twoDim[1].length;
//		
//		for(int i = 0; i < c; ++i) {
//			for(int j = 0; j < l; ++j) {
//				System.out.print(twoDim[i][j]);
//			}
//		}
//		/-------------------------------------/
//		int[][][] n = {
//				{{1 , 2, 3},{4, 5, 6}},
//				{{7 ,8 , 9},{10,11,12}},
//				{{13,14,15},{16,17,18}},
//				{{19,20,21},{22,23,24}}
//		};
//		
//		int d1 = n.length; int d2 = n[0].length; int d3 = n[0][0].length;
//		
//		for (int i = 0; i < d1; i++) {
//			for (int j = 0; j < d2; j++) {
//				for (int j2 = 0; j2 < d3; j2++) {
//					System.out.print(n[i][j][j2] + " ");
//				}
//			}
//		}
//		
//		System.out.println('\n');
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * * Ternary
//		 
//		int age = 28;
//		boolean adult = age >= 18 ? true : false;
//		System.out.println(String.format("Adult : %s", adult));
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * StringObject
//		String lang = "Java";
//		
//		String bclass = lang.getClass().toString();
//		System.out.println(bclass);
//		
//		String sup = lang.getClass().getSuperclass().toString();
//		System.out.println(sup);
//		
//		if (lang.isEmpty()) {
//			System.out.println("The string is empty");
//		}else {
//			System.out.println("The string is not empty");
//		}
//		
//		int l = lang.length();
//		System.out.println("The string has "+ l +" characters");
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * string2
//		String2
//		char[] cdb = {'M', 'y', 's', 'q', 'l'};
//		
//		String lang = "Java";
//		String ide = new String("NetBeans");
//		String db = new String(cdb);
//		
//		System.out.println(lang);
//		System.out.println(ide);
//		System.out.println(db);
//		
//		StringBuilder sb1 = new StringBuilder(lang);
//		StringBuilder sb2 = new StringBuilder();
//		sb2.append("Fields");
//		sb2.append(" of ");
//		sb2.append("Glory");
//		
//		System.out.println(sb1);
//		System.out.println(sb2);
//		
//		byte[] bytes = new byte[] {74,85,91,97,102,121};
//		String str = new String(bytes, Charset.forName("utf-8"));
//		System.out.println(str);
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * StringElement
//		char[] crs = {'Z','e','t','c','o','d','e'};
//		String s = new String(crs);
//		
//		char c1 = s.charAt(0);
//		char c2 = s.charAt(s.length() - 1);
//		
//		System.out.println(c1);
//		System.out.println(c2);
//		
//		int i1 = s.indexOf('e');
//		int i2 = s.lastIndexOf('e');
//		
//		System.out.println("The first index of e is "+i1);
//		System.out.println("The last index of e is "+i2);
//		
//		System.out.println(s.contains("t"));
//		System.out.println(s.contains("f"));
//		
//		char[] elements = s.toCharArray();
//		for(char el : elements) System.out.print(el);
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * * StringBuilder
//		StringBuilder sb = new StringBuilder("Misty Montains");
//		System.out.println(sb);
//		
//		sb.deleteCharAt(sb.length() -1);
//		System.out.println(sb);
//		
//		sb.append('s');
//		System.out.println(sb);
//		
//		sb.insert(0, 'T');
//		sb.insert(1, 'h');
//		sb.insert(2, 'e');
//		sb.insert(3, ' ');
//		System.out.println(sb);
//		
//		sb.setCharAt(4, 'm');
//		System.out.println(sb);
//		*/
//		/*--------------------------------------------------------*/
//		/**
//		 * 
//		 * SimpleObject
//		 *
//		 
//		class Being{}
//		Being b = new Being();
//		System.out.println(b);
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * SearchingArray
//		String[] planets = {"Mercury", "Venus", "Mars", "Earth",
//				"Jupiter","Saturne", "Uranus", "Neptune", "Pluto",};
//		
//		Arrays.sort(planets);
//		
//		String p = "Earth";
//		
//		int r = Arrays.binarySearch(planets, p);
//		String msg;
//		
//		if (r >= 0) {
//			msg = String.format("%s was found at position %d of the "
//					+ "sorted array", p, r);
//		}else {
//			msg = p + " was found";
//		}
//		System.out.println(msg);
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * * Format 
//		System.out.println(3 < 4);
//		System.out.println(3 == 4);
//		System.out.println(4 >= 3);
//		System.out.println(4 != 3);
//		
//		System.out.println(2);
//		System.out.println(+2);
//		System.out.println(-2);
//		
//		System.out.println("There are may stars");
//		System.out.println("He said: \"Which one are you looking at?\"");
//		
//		System.out.format("%.3g%n", 0.0000000);
//		System.out.format("%.3f%n", 54.21251);
//		System.out.format("%.3s%n", "ZetCode");
//		
//		System.out.println(3 + 5 * 5);
//		System.out.println((3 + 5) * 5);
//		
//		System.out.println(! true | true);
//		System.out.println(!(true | true));
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * Nombre premies
//		int[] nums = {1,2,3,4,5,6,7,8,9,
//				10,11,12,13,14,15,16,17,
//				18,19,20,21,22,23,24};
//		
//		System.out.print("Prime numbers: ");
//		
//		for(int num : nums) {
//			if(num == 1 || num == 2 || num == 3) {
//				System.out.print(num + " ");
//				continue;
//			}
//			int i = (int) Math.sqrt(num);
//			
//			boolean isPrime = true;
//			
//			while (i > 1) {
//				if (num % i == 0) {
//					isPrime = false;
//				}
//				i--;
//			}
//			
//			if (isPrime) {
//				System.out.print(num + " ");
//			}
//		}
//		
//		System.out.println('\n');
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * 
//		Random r = new Random();
//		
//		int x = r.nextInt();
//		System.out.println(x);
//		
//		Calendar c = Calendar.getInstance();
//		System.out.println(c.getTime());
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * * foreach
//		int[][] ir = new int[][] {
//			{1,2},
//			{1,2,3},
//			{1,2,3,4}
//		};
//		
//		for (int[] a : ir) {
//			for (int i : a) {
//				System.out.print(i + " ");
//			}
//		}
//		System.out.println('\n');
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * InstanceOf qui renvoie un boolean
//		Base b = new Base();
//		Derived d = new Derived();
//		
//		System.out.println(d instanceof Base);
//		System.out.println(b instanceof Derived);
//		System.out.println(d instanceof Object);
//		*/ 
//		/*--------------------------------------------------------*/
//		//new Human();
//		/*--------------------------------------------------------*/
//		/*
//		int x = 12; int y = 32; int z = 43;
//		Calendar c = Calendar.getInstance();
//		
//		System.out.format("There are %d apples, %d oranges and " + 
//				"%d pears%n", x, y, z);
//		System.out.format("There are %2$d apples, %3$d oranges and " + 
//				"%1$d pears%n", x, y, z);
//		System.out.format("Year: %tY, Month: %<tm, Day: %<td%n", c);
//		
//		System.out.format("%tF%n",c);
//		System.out.format("%tD%n",c);
//		System.out.format("%tT%n",c);
//		
//		System.out.format("%1$tA, %1$tb %1$tY%n",c);
//		System.out.format("%1$td.%1$tm.%1$tY%n",c);
//		
//		System.out.format("%ts%n",c);
//		
//		System.out.format("%+d%n",553);
//		System.out.format("%010d%n",553);
//		System.out.format("%10d%n",533);
//		System.out.format("%-10d%n",553);
//		System.out.format("%d%n",-553);
//		System.out.format("%(d%n",-533);
//		
//		System.out.format("There are %d %s.%n",5, "pencils");
//		System.out.printf("The rock weighs %f kilograms.%n", 5.32);
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * equals
//		int[] a = {1,1,2,1,1};
//		int[] b = {0,0,3,0,0};
//		
//		int[][] c = {
//				{1,1,2,1,1},
//				{0,0,3,0,0}
//		};
//		
//		int[][] d = {a,b};
//		
//		System.out.println("equals() method: ");
//		if (Arrays.equals(a, b)) {
//			System.out.println("Array a, b are equal");
//		}else {
//			System.out.println("Array a, b are not equal");
//		}
//		if (Arrays.equals(c, d)) {
//			System.out.println("Array c, d are equal");
//		}else {
//			System.out.println("Array c, d are not equal");
//		}
//		System.out.println("deepEquals() method: ");
//		if (Arrays.deepEquals(c, d)) {
//			System.out.println("Array c, d are equal");
//		}else {
//			System.out.println("Array c, d are not equal");
//		}
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * Array 
//		int[] a = {5,2,4,3,1};
//		
//		Arrays.sort(a);
//		
//		System.out.println(Arrays.toString(a));
//		
//		Arrays.fill(a, 8);
//		System.out.println(Arrays.toString(a));
//		
//		int[] b = Arrays.copyOf(a, 5);
//		
//		if (Arrays.equals(a, b)) {
//			System.out.println("Array a, b are equal");
//		}else {
//			System.out.println("Array a, b are not equal");
//		}
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * boite de dialogue
//		 
//		int nombre1 = Integer.parseInt( JOptionPane.showInputDialog("Entrer le premier nombre: ") );
//		int nombre2 = Integer.parseInt( JOptionPane.showInputDialog("Entrer le second nombre: ") );
//		
//		String message = String.format("La somme de %d et %d est %d", nombre1, nombre2, nombre1 +nombre2);
//		
//		JOptionPane.showMessageDialog(null, message);
//		*/
//		/*--------------------------------------------------------*/
//		/*
//		 * 
//		 
//		Personne p1 = new Personne("NDIAYE", "Mamadou", 27);
//		Personne p2 = new Personne("SY", "Binta", 32);
//		
//		System.out.println(Personne.NOMBRE_MAX_OREILLES);
//		System.out.println(p1.full_name("Je suis"));
//		
//		try {
//			p1.setAge(11);
//		} catch (IllegalArgumentException e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
//		*/	
//		/*--------------------------------------------------------*/
//		
//		try {
//			//File file = new File("C:/Users/bdame/eclipse-workspace/TPEX/src/myFile.txt");
//			//System.out.println(file.length());
//			/*-----------------------------------------------------------------*/
//			//Files.createDirectories(Paths.get("C:/Users/bdame/eclipse-workspace/newDir"));
//			/*-----------------------------------------------------------------*/
//			//Path fromPath = Paths.get("C:/Users/bdame/eclipse-workspace/TPEX/src/myFile.txt");
//			//Path toPath = Paths.get("C:/Users/bdame/eclipse-workspace/TPEX/src/myFile1.txt");
//			
//			//CopyOption[] options = new CopyOption[] {
//				//StandardCopyOption.REPLACE_EXISTING,
//				//StandardCopyOption.COPY_ATTRIBUTES
//			//};
//			
//			//Files.copy(fromPath, toPath, options);
//			/*-----------------------------------------------------------------*/
//			//Instant instant = Instant.now();
//			//System.out.println(instant);
//			
//			//LocalDateTime now = LocalDateTime.now();
//			
//			//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//			//System.out.println(dtf.format(now));
//			/*-----------------------------------------------------------------*/
//			/*
//			 * 
//			String filename = "C:/Users/bdame/eclipse-workspace/TPEX/src/myFile.txt";
//			Path myPath = Paths.get(filename);
//			
//			if (Files.isExecutable(myPath)) {
//				System.out.println("The file is executable");
//			}else {8
//				System.out.println("The file is not executable");
//			}
//			if (Files.isReadable(myPath)) {
//				System.out.println("The file is readable");
//			}else {
//				System.out.println("The file is not readable");
//			}
//			if (Files.isWritable(myPath)) {
//				System.out.println("The file is writable");
//			}else {
//				System.out.println("The file is not writable");
//			}
//			*/
//			/*-----------------------------------------------------------------*/
//			//try(Stream<Path> paths = Files.walk(Paths.get("C:/Users/bdame/eclipse-workspace/TPEX/src"))){
//				//paths.forEach(System.out::println);			}
//			/*-----------------------------------------------------------------*/
//			//String dirName = "C:/Users/bdame/eclipse-workspace/TPEX/src";
//			
//			//Files.list( new File(dirName).toPath() )
//				//.limit(10)
//				//.forEach(path -> {
//					//System.out.println(path);
//				 //});
//			/*--------------------------------------------------------*/
//			//String fileName = "C:/Users/bdame/eclipse-workspace/TPEX/src/myFile.txt";
//			
//			//List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
//			
//			//StringBuffer sb = new StringBuffer();
//			
//			//for (String line : lines) {
//				//sb.append(line);
//				//sb.append(System.lineSeparator());
//			//}
//			
//			//System.out.println(sb);
//			/*--------------------------------------------------------*/
//			//String fileName = "C:/Users/bdame/eclipse-workspace/TPEX/src/myFile.txt";
//			//Path myPath = Paths.get(fileName);
//			
//			//Charset charset = Charset.forName("UTF-8");
//			//String str = "Today is a beautiful day\n"
//					//+ "Bonjour,\r\n"
//					//+ "Je me nomme Mamadou\r\n"
//					//+ "j'ai 27 ans\r\n"
//					//+ "J'habite en France";
//			
//			//try(BufferedWriter writer = Files.newBufferedWriter(myPath, charset)){
//				//writer.write(str, 0, str.length());
//			//}catch (IOException e) {
//				// TODO: handle exception
//				//System.err.format("IOExceptionn: %s%n", e);
//			//}
//			/*--------------------------------------------------------*/
//			//Path path = FileSystems.getDefault().getPath("C:/Users/bdame/eclipse-workspace/TPEX/src/myFile.txt");
//			
//			//BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
//			//BasicFileAttributes attrs = view.readAttributes();
//			
//			//System.out.println("Creation time: " + attrs.creationTime());
//			//System.out.println("Last Accessed time " + attrs.lastAccessTime());
//			//System.out.println("Last Modified time: " + attrs.lastModifiedTime());
//			//System.out.println("File key: " + attrs.fileKey());
//			//System.out.println("Directory: " + attrs.isDirectory());
//			//System.out.println("Other Type of file: " + attrs.isOther());
//			//System.out.println("Regular file: " + attrs.isRegularFile());
//			//System.out.println("Symbol file: " + attrs.isSymbolicLink());
//			//System.out.printf("Size: %d bytes%n", attrs.size());
//			
//			
//			/*--------------------------------------------------------*/
//			//BigInteger b = new BigInteger("5369854236865126");
//			//System.out.println(b);
//			
//			//byte [] val = {0,-1};
//			//BigInteger c = new BigInteger(val);
//			//System.out.println(c);
//			
//			//int d = 1000, e = 999999999;
//			//Random r = new Random();
//			//BigInteger f = new BigInteger(d, e , r);
//			//System.out.println(f);
//			
//			/*int FibonacciCount = 100;
//	        BigInteger fibonacci [] = new BigInteger[FibonacciCount];
//	        //declare object called fibonacci [] as an array 
//	        fibonacci[0]=BigInteger.ONE;
//	        fibonacci[1]=BigInteger.ONE;
//	        fibonacci[2]=BigInteger.ONE;
//	        //initialize the fibonacci object to 1 using the BigInteger constant ONE
//	        
//	        for(int j = 3;j<FibonacciCount;j++){
//	        fibonacci[j]= fibonacci[j-1].add(fibonacci[j-2]).add(fibonacci[j-3]);
//	            
//	        }
//	        for(int i= 0;i<FibonacciCount;i++){
//	        System.out.println(fibonacci[i]+"-------------------------------------------------------------------------");
//	        }*/
//	        
//	        BigInteger bi = new BigInteger("12323", 10);// string,base
//			System.out.println(bi);
//
//			BigInteger[] B = new BigInteger[3];
//
//			int ten = 10;
//			B[0] = new BigInteger("11111111111111");
//			B[1] = new BigInteger(Integer.valueOf(ten).toString());
//			B[2] = B[0].multiply(B[1]);
//			System.out.println(B[2]);
//
//			int i;
//			BigInteger BG = BigInteger.valueOf(1);
//
//			System.out.println(BG);
//
//			for (i = 1; i <= 10; i++) {
//				BG=BG.multiply(BigInteger.valueOf(i));
//				System.out.println(BG.bitLength());
//			}
//
//			System.out.println(BG.bitLength());
//			
//			/*--------------------------------------------------------*/
//			/*--------------------------------------------------------*/
//			/*--------------------------------------------------------*/
//			/*--------------------------------------------------------*/
//			/*--------------------------------------------------------*/
//			/*--------------------------------------------------------*/
//			/*--------------------------------------------------------*/
//			/*--------------------------------------------------------*/
//			/*--------------------------------------------------------*/
//			/*--------------------------------------------------------*/
//			/*--------------------------------------------------------*/
//			/*--------------------------------------------------------*/
//			/*-----------------------------------------------------------------*/
//		} catch (Exception e) {
//			System.out.println("Il y'a un soucis");
//		}
//		
//		
//	}
//
//}
