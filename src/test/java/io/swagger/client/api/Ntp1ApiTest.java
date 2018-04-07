/*
 * Neblio REST API Suite
 * APIs for Interacting with NTP1 Tokens & The Neblio Blockchain
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.BroadcastTxRequest;
import io.swagger.client.model.BroadcastTxResponse;
import io.swagger.client.model.BurnTokenRequest;
import io.swagger.client.model.BurnTokenResponse;
import io.swagger.client.model.Error;
import io.swagger.client.model.GetAddressInfoResponse;
import io.swagger.client.model.GetTokenHoldersResponse;
import io.swagger.client.model.GetTokenIdResponse;
import io.swagger.client.model.GetTokenMetadataResponse;
import io.swagger.client.model.IssueTokenRequest;
import io.swagger.client.model.IssueTokenResponse;
import io.swagger.client.model.SendTokenRequest;
import io.swagger.client.model.SendTokenResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for Ntp1Api
 */
@Ignore
public class Ntp1ApiTest {

    private final Ntp1Api api = new Ntp1Api();

    
    /**
     * Broadcasts a signed raw transaction to the network
     *
     * Broadcasts a signed raw transaction to the network. If successful returns the txid of the broadcast trasnaction. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void broadcastTxTest() throws ApiException {
        BroadcastTxRequest body = null;
        BroadcastTxResponse response = api.broadcastTx(body);

        // TODO: test validations
    }
    
    /**
     * Builds a transaction that burns an NTP1 Token
     *
     * Builds an unsigned raw transaction that burns an NTP1 token on the Neblio blockchain. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void burnTokenTest() throws ApiException {
        BurnTokenRequest body = null;
        BurnTokenResponse response = api.burnToken(body);

        // TODO: test validations
    }
    
    /**
     * Information On a Neblio Address
     *
     * Returns both NEBL and NTP1 token UTXOs held at the given address. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAddressInfoTest() throws ApiException {
        String address = null;
        GetAddressInfoResponse response = api.getAddressInfo(address);

        // TODO: test validations
    }
    
    /**
     * Get Addresses Holding a Token
     *
     * Returns the the the addresses holding a token and how many tokens are held 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokenHoldersTest() throws ApiException {
        String tokenid = null;
        GetTokenHoldersResponse response = api.getTokenHolders(tokenid);

        // TODO: test validations
    }
    
    /**
     * Returns the tokenId representing a token
     *
     * Translates a token symbol to a tokenId if a token exists with that symbol on the network 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokenIdTest() throws ApiException {
        String tokensymbol = null;
        GetTokenIdResponse response = api.getTokenId(tokensymbol);

        // TODO: test validations
    }
    
    /**
     * Get Issuance Metadata of Token
     *
     * Returns the metadata associated with a token at time of issuance.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokenMetadataOfIssuanceTest() throws ApiException {
        String tokenid = null;
        GetTokenMetadataResponse response = api.getTokenMetadataOfIssuance(tokenid);

        // TODO: test validations
    }
    
    /**
     * Get UTXO Metadata of Token
     *
     * Returns the metadata associated with a token for that specific utxo instead of the issuance transaction. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokenMetadataOfUtxoTest() throws ApiException {
        String tokenid = null;
        String utxo = null;
        GetTokenMetadataResponse response = api.getTokenMetadataOfUtxo(tokenid, utxo);

        // TODO: test validations
    }
    
    /**
     * Builds a transaction that issues a new NTP1 Token
     *
     * Builds an unsigned raw transaction that issues a new NTP1 token on the Neblio blockchain. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueTokenTest() throws ApiException {
        IssueTokenRequest body = null;
        IssueTokenResponse response = api.issueToken(body);

        // TODO: test validations
    }
    
    /**
     * Builds a transaction that sends an NTP1 Token
     *
     * Builds an unsigned raw transaction that sends an NTP1 token on the Neblio blockchain. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendTokenTest() throws ApiException {
        SendTokenRequest body = null;
        SendTokenResponse response = api.sendToken(body);

        // TODO: test validations
    }
    
}
