package org.fisco.bcos.channel.test.console;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.fisco.bcos.web3j.console.ConsoleFace;
import org.fisco.bcos.web3j.console.ConsoleImpl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class ConsoleTest{
	
    private static ConsoleFace console = new ConsoleImpl();
    
	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();
	
    @Test
    public void helpTest() {
        console.help();
        assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getBlockNumberTest() throws IOException {
    	console.getBlockNumber();
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getPbftViewTest() throws IOException {
    	console.getPbftView();
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getMinerListTest() throws IOException {
    	console.getMinerList();
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getObserverListTest() throws IOException {
    	console.getObserverList();
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getConsensusStatusTest() throws IOException {
    	console.getConsensusStatus();
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getSyncStatusTest() throws IOException {
    	console.getSyncStatus();
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getClientVersionTest() throws IOException {
    	console.getClientVersion();
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getPeersTest() throws IOException {
    	console.getPeers();
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getGroupPeersTest() throws IOException {
    	console.getGroupPeers();
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getGroupListTest() throws IOException {
    	console.getGroupList();
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getBlockByHash() throws IOException {
    	String[] params1 = {};
    	console.getBlockByHash(params1);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params2 = {"gbbh", "-h"};
    	console.getBlockByHash(params2);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params3 = {"gbbh", "0x2"};
    	console.getBlockByHash(params3);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params4 = {"gbbh", "0xca0577fa37367e89628e2db0a7adfccdd4b53e5fe781d7e34a3d5edbe29d1961"};
    	console.getBlockByHash(params4);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params5 = {"gbbh", "0xca0577fa37367e89628e2db0a7adfccdd4b53e5fe781d7e34a3d5edbe29d1961", "true"};
    	console.getBlockByHash(params5);
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getBlockByNumberTest() throws IOException {
    	String[] params1 = {};
    	console.getBlockByNumber(params1);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params2 = {"gbbn", "-h"};
    	console.getBlockByNumber(params2);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params3 = {"gbbn", "ae"};
    	console.getBlockByNumber(params3);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params4 = {"gbbn", "0"};
    	console.getBlockByNumber(params4);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params5 = {"gbbn", "0", "true"};
    	console.getBlockByNumber(params5);
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getBlockHashByNumberTest() throws IOException {
    	String[] params1 = {};
    	console.getBlockHashByNumber(params1);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params2 = {"ghbn", "-h"};
    	console.getBlockHashByNumber(params2);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params3 = {"ghbn", "ae"};
    	console.getBlockHashByNumber(params3);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params4 = {"ghbn", "0"};
    	console.getBlockHashByNumber(params4);
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getTransactionByHashTest() throws IOException {
    	String[] params1 = {};
    	console.getTransactionByHash(params1);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params2 = {"gtbh", "-h"};
    	console.getTransactionByHash(params2);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params3 = {"gtbh", "ae"};
    	console.getTransactionByHash(params3);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params4 = {"gtbh", "0xa1bab4089cccf4a30437babc6a43b9ab4ec30225f60630ac7d766f16037d7042"};
    	console.getTransactionByHash(params4);
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getTransactionByBlockHashAndIndexTest() throws IOException {
    	String[] params1 = {};
    	console.getTransactionByBlockHashAndIndex(params1);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params2 = {"gthi", "-h"};
    	console.getTransactionByBlockHashAndIndex(params2);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params3 = {"gthi", "ae"};
    	console.getTransactionByBlockHashAndIndex(params3);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params4 = {"gthi", "0xca0577fa37367e89628e2db0a7adfccdd4b53e5fe781d7e34a3d5edbe29d1961", "a"};
    	console.getTransactionByBlockHashAndIndex(params4);
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getTransactionByBlockNumberAndIndexTest() throws IOException {
    	String[] params1 = {};
    	console.getTransactionByBlockNumberAndIndex(params1);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params2 = {"gtni", "-h"};
    	console.getTransactionByBlockNumberAndIndex(params2);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params3 = {"gtni", "ae"};
    	console.getTransactionByBlockNumberAndIndex(params3);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params4 = {"gtni", "1", "a"};
    	console.getTransactionByBlockNumberAndIndex(params4);
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getTransactionReceiptTest() throws IOException {
    	String[] params1 = {};
    	console.getTransactionReceipt(params1);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params2 = {"gtr", "-h"};
    	console.getTransactionReceipt(params2);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params3 = {"gtr", "ae"};
    	console.getTransactionReceipt(params3);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params4 = {"gtr", "0xa1bab4089cccf4a30437babc6a43b9ab4ec30225f60630ac7d766f16037d7042"};
    	console.getTransactionReceipt(params4);
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getPendingTransactionsTest() throws IOException {
    	console.getPendingTransactions();
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getCodeTest() throws IOException {
    	String[] params1 = {};
    	console.getCode(params1);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params2 = {"gc", "-h"};
    	console.getCode(params2);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params3 = {"gc", "ae"};
    	console.getCode(params3);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params4 = {"gc", "0xa94f5374fce5edbc8e2a8697c15331677e6ebf0b"};
    	console.getCode(params4);
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void getTotalTransactionCountTest() throws IOException {
    	console.getTotalTransactionCount();
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    }
    @Test(expected= ClassNotFoundException.class) 
    public void deployTestException() throws Exception {
    	String[] params = {"d", "ae", "1.0"};
    	console.deploy(params);
    }
    @Test
    public void deployTest() throws Exception {
    	String[] params1 = {};
    	console.deploy(params1);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params2 = {"d", "-h"};
    	console.deploy(params2);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
        	
    	String[] params3 = {"d", "Ok"};
    	console.deploy(params3);
    	assertTrue(!"".equals(log.getLog()));
    	
    	String[] params4 = {"d", "Ok", "1.0"};
    	console.deploy(params4);
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void callTest() throws Exception {
    	String[] params1 = {};
    	console.call(params1);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params2 = {"c", "-h"};
    	console.call(params2);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params3 = {"c", "Ok"};
    	console.call(params3);
    	assertTrue(!"".equals(log.getLog()));
    	
    	String[] params4 = {"c", "Ok", "1.0"};
    	console.call(params4);
    	assertTrue(!"".equals(log.getLog()));
    	
    }
    @Test
    public void addPbftTest() throws Exception {
    	String[] params1 = {};
    	console.addPbft(params1);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params2 = {"ap", "-h"};
    	console.addPbft(params2);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params3 = {"ap", "ae"};
    	console.addPbft(params3);
    	assertTrue(!"".equals(log.getLog()));
    	
    	String[] params4 = {"ap", "037c255c06161711b6234b8c0960a6979ef039374ccc8b723afea2107cba3432dbbc837a714b7da20111f74d5a24e91925c773a72158fa066f586055379a1772"};
    	console.addPbft(params4);
    	assertTrue(!"".equals(log.getLog()));
    }
    @Test
    public void removePbftTest() throws Exception {
    	String[] params1 = {};
    	console.removePbft(params1);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params2 = {"rp", "-h"};
    	console.removePbft(params2);
    	assertTrue(!"".equals(log.getLog()));
    	log.clearLog();
    	
    	String[] params3 = {"rp", "ae"};
    	console.removePbft(params3);
    	assertTrue(!"".equals(log.getLog()));
    	
    	String[] params4 = {"rp", "037c255c06161711b6234b8c0960a6979ef039374ccc8b723afea2107cba3432dbbc837a714b7da20111f74d5a24e91925c773a72158fa066f586055379a1772"};
    	console.removePbft(params4);
    	assertTrue(!"".equals(log.getLog()));
    }
    
}