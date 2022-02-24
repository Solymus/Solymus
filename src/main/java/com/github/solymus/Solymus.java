package com.github.solymus;

import com.github.solymus.server.ServerSingleton;

public class Solymus {

    /**
     * Class responsible for creating a single instance of the Server class.
     */
    public static void main(String[] args) {
        new ServerSingleton();
    }

}
