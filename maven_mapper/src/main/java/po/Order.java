package po;

import java.sql.Date;

public class Order extends Base{
    private int order_id;
    private Store store;
    private String order_view_id;
    private String order_type;
    private User user;
    private double order_origin_price;
    private double order_delivery_price;
    private double order_real_price;
    private Date order_recieve_time;
    private String order_status;
    private Date order_pay_time;
    private Sender sender;
    private String memo;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getOrder_view_id() {
        return order_view_id;
    }

    public void setOrder_view_id(String order_view_id) {
        this.order_view_id = order_view_id;
    }

    public String getOrder_type() {
        return order_type;
    }

    public void setOrder_type(String order_type) {
        this.order_type = order_type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getOrder_origin_price() {
        return order_origin_price;
    }

    public void setOrder_origin_price(double order_origin_price) {
        this.order_origin_price = order_origin_price;
    }

    public double getOrder_delivery_price() {
        return order_delivery_price;
    }

    public void setOrder_delivery_price(double order_delivery_price) {
        this.order_delivery_price = order_delivery_price;
    }

    public double getOrder_real_price() {
        return order_real_price;
    }

    public void setOrder_real_price(double order_real_price) {
        this.order_real_price = order_real_price;
    }

    public Date getOrder_recieve_time() {
        return order_recieve_time;
    }

    public void setOrder_recieve_time(Date order_recieve_time) {
        this.order_recieve_time = order_recieve_time;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public Date getOrder_pay_time() {
        return order_pay_time;
    }

    public void setOrder_pay_time(Date order_pay_time) {
        this.order_pay_time = order_pay_time;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
