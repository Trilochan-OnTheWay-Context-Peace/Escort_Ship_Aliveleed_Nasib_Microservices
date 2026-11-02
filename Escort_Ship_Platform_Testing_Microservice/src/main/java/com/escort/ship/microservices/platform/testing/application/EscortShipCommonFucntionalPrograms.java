package com.white.ship.microservices.platform.testing.application;


import com.white.ship.microservices.platform.testing.application.collections.EscortShipCollections;
import com.white.ship.microservices.platform.testing.application.concurrency.EscortShipConcurrency;
import com.white.ship.microservices.platform.testing.application.features.EscortShipJavaEightFeatures;
import com.white.ship.microservices.platform.testing.application.miscellenous.EscortShipMisellenousCodes;
import com.white.ship.microservices.platform.testing.application.streams.EscortShipStreams;

public class EscortShipCommonFucntionalPrograms {

    private static final EscortShipCommonFucntionalPrograms whiteHeavenCommonFucntionalPrograms = EscortShipCommonFucntionalPrograms.getInstance();

    private static EscortShipCommonFucntionalPrograms _instance;

    private static EscortShipCollections whiteHeavenCollections;

    private static EscortShipConcurrency whiteHeavenConcurrency;

    private static EscortShipJavaEightFeatures whiteHeavenJavaEightFeatures;

    private static EscortShipStreams whiteHeavenStreams;

    private static EscortShipMisellenousCodes whiteHeavenMisellenousCodes;

    public static EscortShipCommonFucntionalPrograms getInstance() {
        if(_instance == null) {
            _instance = new EscortShipCommonFucntionalPrograms();
        }
        if(_instance.getEscortShipCollections() == null) {
            whiteHeavenCollections = new EscortShipCollections();
        }
        if(_instance.getEscortShipConcurrency() == null) {
            whiteHeavenConcurrency = new EscortShipConcurrency();
        }
        if(_instance.getEscortShipJavaEightFeatures() == null) {
            whiteHeavenJavaEightFeatures = new EscortShipJavaEightFeatures();
        }
        if(_instance.getEscortShipStreams() == null) {
            whiteHeavenStreams = new EscortShipStreams();
        }
        if(_instance.getEscortShipMisellenousCodes() == null) {
            whiteHeavenMisellenousCodes = new EscortShipMisellenousCodes();
        }
        return _instance;
    }

    public static EscortShipMisellenousCodes getEscortShipMisellenousCodes() {
        return whiteHeavenMisellenousCodes;
    }

    public EscortShipCollections getEscortShipCollections() {
        return whiteHeavenCollections;
    }


    public EscortShipConcurrency getEscortShipConcurrency() {
        return whiteHeavenConcurrency;
    }

    public EscortShipJavaEightFeatures getEscortShipJavaEightFeatures() {
        return whiteHeavenJavaEightFeatures;
    }

    public EscortShipStreams getEscortShipStreams() {
        return whiteHeavenStreams;
    }

    private static void executeCodes() {
        EscortShipCollections whiteHeavenCollections = whiteHeavenCommonFucntionalPrograms.getEscortShipCollections();
        EscortShipConcurrency whiteHeavenConcurrency = whiteHeavenCommonFucntionalPrograms.getEscortShipConcurrency();
        EscortShipJavaEightFeatures whiteHeavenJavaEightFeatures = whiteHeavenCommonFucntionalPrograms.getEscortShipJavaEightFeatures();
        EscortShipStreams whiteHeavenStreams = whiteHeavenCommonFucntionalPrograms.getEscortShipStreams();;
        EscortShipMisellenousCodes whiteHeavenMisellenousCodes = whiteHeavenCommonFucntionalPrograms.getEscortShipMisellenousCodes();
        // Streams
        whiteHeavenStreams.runExecuteJavaCodes();
        // Collections
        whiteHeavenCollections.runExecuteJavaCodes();
        //Data Structure
        whiteHeavenMisellenousCodes.runExecuteJavaCodes();
    }



}
