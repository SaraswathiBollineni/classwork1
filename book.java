
public class Book {
	String bookname,authorname,publisher;
	long ISBNnumber;
	Book(){
		String bookname=authorname=publisher="";
		long ISBNnumber=0;
	}
	Book(String a,int b,String c,String d){
		bookname=a;
		ISBNnumber=b;
		authorname=c;
		publisher=d;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname=bookname;
	}
    public long getISBNnumber() {
	    return ISBNnumber;
    }
    public void setISBNnumber(long iSBNnumber) {
    	this.ISBNnumber=iSBNnumber;
    }
    public String getAuthorname() {
    	return authorname;
    }
    public void setAuthorname(String authorname) {
    	this.authorname=authorname;
    }
    public String getPublisher() {
    	return publisher;
    }
    public void setPublisher(String publisher) {
    	this.publisher=publisher;
    }
    void getBookInfo() {
    	System.out.println(bookname+" "+ISBNnumber+" "+authorname+" "+publisher);
    }
 
    

}

