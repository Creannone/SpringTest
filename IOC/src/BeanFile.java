public class BeanFile {
    private String driverClass;
    private String url;
    private String username1;
    private String password;

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "BeanFile{" +
                "driverClass='" + driverClass + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username1 + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
