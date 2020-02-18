package com.company;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
    double calcSegmentLen(Point p1, Point p2) throws RemoteException;

    double calcCircleLen(Point centerPoint, Point radiusPoint) throws RemoteException;

    double calcCircleArea(Point centerPoint, Point radiusPoint) throws RemoteException;

    double calcCircleLenByDiameter(Point p1, Point p2) throws RemoteException;

    double calcCircleAreaByDiameter(Point p1, Point p2) throws RemoteException;
}