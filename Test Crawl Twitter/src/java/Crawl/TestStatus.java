/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crawl;

/**
 *
 * @author letru
 */
public class TestStatus {
    String statusId, statusMessage;

    public TestStatus(String statusId, String statusMessage) {
        this.statusId = statusId;
        this.statusMessage = statusMessage;
    }

    public TestStatus() {
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
}
