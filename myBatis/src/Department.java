public class Department {

  private long id;
  private String departmentName;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  @Override
  public String toString() {
    return "Department{" +
            "id=" + id +
            ", departmentName='" + departmentName + '\'' +
            '}';
  }
}
