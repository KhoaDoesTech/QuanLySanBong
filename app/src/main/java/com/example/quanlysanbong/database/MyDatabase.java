package com.example.quanlysanbong.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.quanlysanbong.dao.CustomerDAO;
import com.example.quanlysanbong.dao.HistoryBuyDAO;
import com.example.quanlysanbong.dao.ManagerCategoryDAO;
import com.example.quanlysanbong.dao.ManagerDAO;
import com.example.quanlysanbong.dao.NotificationDAO;
import com.example.quanlysanbong.dao.NotificationDetailsDAO;
import com.example.quanlysanbong.dao.OrderDAO;
import com.example.quanlysanbong.dao.OrderDetailsDAO;
import com.example.quanlysanbong.dao.PitchCategoryDAO;
import com.example.quanlysanbong.dao.PitchDAO;
import com.example.quanlysanbong.dao.ServiceDAO;
import com.example.quanlysanbong.dao.TimeDAO;
import com.example.quanlysanbong.dao.TimeOrderDetailsDAO;
import com.example.quanlysanbong.model.Customer;
import com.example.quanlysanbong.model.HistoryBuy;
import com.example.quanlysanbong.model.Manager;
import com.example.quanlysanbong.model.ManagerCategory;
import com.example.quanlysanbong.model.MyNotification;
import com.example.quanlysanbong.model.MyTime;
import com.example.quanlysanbong.model.NotificationDetails;
import com.example.quanlysanbong.model.Order;
import com.example.quanlysanbong.model.OrderDetails;
import com.example.quanlysanbong.model.Pitch;
import com.example.quanlysanbong.model.PithCategory;
import com.example.quanlysanbong.model.ServiceBall;
import com.example.quanlysanbong.model.TimeOrderDetails;

@Database(entities = {Customer.class,Manager.class, Order.class
        , OrderDetails.class, Pitch.class, PithCategory.class
        , ServiceBall.class, ManagerCategory.class, MyNotification.class
        , MyTime.class, TimeOrderDetails.class, HistoryBuy.class
        , NotificationDetails.class}, version = 1)
public abstract class MyDatabase extends RoomDatabase {

    private static String DB_NAME = "PITCH_MANAGER22";
    private static MyDatabase instance;

    public static synchronized MyDatabase getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),MyDatabase.class,DB_NAME)
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

    public abstract CustomerDAO customerDAO();
    public abstract ManagerDAO managerDAO();
    public abstract OrderDAO orderDAO();
    public abstract OrderDetailsDAO orderDetailsDAO();
    public abstract PitchCategoryDAO pitchCategoryDAO();
    public abstract PitchDAO pitchDao();
    public abstract ServiceDAO serviceDAO();
    public abstract ManagerCategoryDAO managerCategoryDAO();
    public abstract TimeOrderDetailsDAO timeOrderDetailsDAO();
    public abstract TimeDAO timeDAO();
    public abstract HistoryBuyDAO historyBuyDAO();
    public abstract NotificationDetailsDAO notificationDetailsDAO();
    public abstract NotificationDAO notificationDAO();
}
