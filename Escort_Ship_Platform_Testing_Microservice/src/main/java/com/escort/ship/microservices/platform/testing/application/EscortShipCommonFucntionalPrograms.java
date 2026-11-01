package com.white.ship.microservices.platform.testing.application;


import com.white.ship.microservices.platform.testing.application.collections.WhiteHeavenCollections;
import com.white.ship.microservices.platform.testing.application.concurrency.WhiteHeavenConcurrency;
import com.white.ship.microservices.platform.testing.application.features.WhiteHeavenJavaEightFeatures;
import com.white.ship.microservices.platform.testing.application.miscellenous.WhiteHeavenMisellenousCodes;
import com.white.ship.microservices.platform.testing.application.streams.WhiteHeavenStreams;

public class WhiteHeavenCommonFucntionalPrograms {

    private static final WhiteHeavenCommonFucntionalPrograms whiteHeavenCommonFucntionalPrograms = WhiteHeavenCommonFucntionalPrograms.getInstance();

    private static WhiteHeavenCommonFucntionalPrograms _instance;

    private static WhiteHeavenCollections whiteHeavenCollections;

    private static WhiteHeavenConcurrency whiteHeavenConcurrency;

    private static WhiteHeavenJavaEightFeatures whiteHeavenJavaEightFeatures;

    private static WhiteHeavenStreams whiteHeavenStreams;

    private static WhiteHeavenMisellenousCodes whiteHeavenMisellenousCodes;

    public static WhiteHeavenCommonFucntionalPrograms getInstance() {
        if(_instance == null) {
            _instance = new WhiteHeavenCommonFucntionalPrograms();
        }
        if(_instance.getWhiteHeavenCollections() == null) {
            whiteHeavenCollections = new WhiteHeavenCollections();
        }
        if(_instance.getWhiteHeavenConcurrency() == null) {
            whiteHeavenConcurrency = new WhiteHeavenConcurrency();
        }
        if(_instance.getWhiteHeavenJavaEightFeatures() == null) {
            whiteHeavenJavaEightFeatures = new WhiteHeavenJavaEightFeatures();
        }
        if(_instance.getWhiteHeavenStreams() == null) {
            whiteHeavenStreams = new WhiteHeavenStreams();
        }
        if(_instance.getWhiteHeavenMisellenousCodes() == null) {
            whiteHeavenMisellenousCodes = new WhiteHeavenMisellenousCodes();
        }
        return _instance;
    }

    public static WhiteHeavenMisellenousCodes getWhiteHeavenMisellenousCodes() {
        return whiteHeavenMisellenousCodes;
    }

    public WhiteHeavenCollections getWhiteHeavenCollections() {
        return whiteHeavenCollections;
    }


    public WhiteHeavenConcurrency getWhiteHeavenConcurrency() {
        return whiteHeavenConcurrency;
    }

    public WhiteHeavenJavaEightFeatures getWhiteHeavenJavaEightFeatures() {
        return whiteHeavenJavaEightFeatures;
    }

    public WhiteHeavenStreams getWhiteHeavenStreams() {
        return whiteHeavenStreams;
    }

    private static void executeCodes() {
        WhiteHeavenCollections whiteHeavenCollections = whiteHeavenCommonFucntionalPrograms.getWhiteHeavenCollections();
        WhiteHeavenConcurrency whiteHeavenConcurrency = whiteHeavenCommonFucntionalPrograms.getWhiteHeavenConcurrency();
        WhiteHeavenJavaEightFeatures whiteHeavenJavaEightFeatures = whiteHeavenCommonFucntionalPrograms.getWhiteHeavenJavaEightFeatures();
        WhiteHeavenStreams whiteHeavenStreams = whiteHeavenCommonFucntionalPrograms.getWhiteHeavenStreams();;
        WhiteHeavenMisellenousCodes whiteHeavenMisellenousCodes = whiteHeavenCommonFucntionalPrograms.getWhiteHeavenMisellenousCodes();
        // Streams
        whiteHeavenStreams.runExecuteJavaCodes();
        // Collections
        whiteHeavenCollections.runExecuteJavaCodes();
        //Data Structure
        whiteHeavenMisellenousCodes.runExecuteJavaCodes();
    }



}
