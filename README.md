this.getClass().getClassLoader().getResourceAsStream

[JAVA֮URL](http://www.blogjava.net/baoyaer/articles/120422.html)

�����������ȴ���URL����url������������ϴ���������ȡInputStreamReader�������ɴ˶��󴴽�BufferedReader����br����br�ж�ȡ���ݼ��ɵõ�url��ָ������Դ�ļ���
���������openStream()����ֻ�ܶ�ȡ������Դ����Ҫ���ܶ�ȡ���ܷ������ݣ���Ҫ�õ�URL���openConnection()����������һ�� URLConnection��Ķ��󣬴˶����ڱ��ػ���URLָ����Զ�̽ڵ㽨��һ��HTTPЭ�������ͨ�����ɽ���˫�����ݴ��䡣
������URLConnection�ṩ�˺ܶ����úͻ�ȡ���Ӳ����ķ�������õ�����getInputStream()��getOutputStream()�������磺
����URL sum=new URL("http://java.sum.com/cgi-bin/backwards");
����URLConnection suncon=buaa.openConnection();
����sumcon.setDoOutput(true);
����DataInputStream dis=new DataInputStream(suncon.getInputStream());
����PrintStream ps=new PrintStream(suncon.getOutputStream());
����String str=dis.readLine();
����ps.println("���Կͻ�������Ϣ��.......");