
package pojo;
public class user {
	//This class represents REQUEST model,ie Data we are SENDING to API 
	private String name;
    private String job;

    public user() {
    }

    public user(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}