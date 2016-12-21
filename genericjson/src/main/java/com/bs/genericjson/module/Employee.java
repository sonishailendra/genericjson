/**
 * 
 */
package com.bs.genericjson.module;

import com.bs.genericjson.convertor.JsonPojoParserInt;

/**
 * @author Shailendra Soni
 *
 */
public class Employee implements JsonPojoParserInt{

    private String employeetype;
    private String dept;
    private int phoneextn;
    private User user;

    /**
     * @return the employeeType
     */
    public String getEmployeetype() {
        return employeetype;
    }

    /**
     * @param employeeType
     *            the employeeType to set
     */
    public void setEmployeetype(String employeetype) {
        this.employeetype = employeetype;
    }

    /**
     * @return the dept
     */
    public String getDept() {
        return dept;
    }

    /**
     * @param dept
     *            the dept to set
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * @return the phoneextn
     */
    public int getPhoneextn() {
        return phoneextn;
    }

    /**
     * @param phoneextn
     *            the phoneextn to set
     */
    public void setPhoneextn(int phoneextn) {
        this.phoneextn = phoneextn;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Employee [employeeType=");
        builder.append(employeetype);
        builder.append(", dept=");
        builder.append(dept);
        builder.append(", phoneextn=");
        builder.append(phoneextn);
        builder.append(", user=");
        builder.append(user);
        builder.append("]");
        return builder.toString();
    }

	/**
	 * @return the user
	 */
    public User getUser() {
	    return user;
    }

	/**
	 * @param user the user to set
	 */
    public void setUser(User user) {
	    this.user = user;
    }

}
