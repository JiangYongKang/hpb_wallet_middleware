package com.hpb.bc.entity;

import java.math.BigInteger;
import java.util.Date;

public class TxTransferRecord extends BaseEntity {
    private boolean status;
    private BigInteger gasUsed;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_transfer_record.tx_hash
     *
     * @mbg.generated
     */
    private String txHash;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_transfer_record.block_hash
     *
     * @mbg.generated
     */
    private String blockHash;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_transfer_record.block_number
     *
     * @mbg.generated
     */
    private Long blockNumber;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_transfer_record.block_timestamp
     *
     * @mbg.generated
     */
    private Long blockTimestamp;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_transfer_record.contract_address
     *
     * @mbg.generated
     */
    private String contractAddress;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_transfer_record.from_address
     *
     * @mbg.generated
     */
    private String fromAddress;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_transfer_record.to_address
     *
     * @mbg.generated
     */
    private String toAddress;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_transfer_record.quantity
     *
     * @mbg.generated
     */
    private String quantity;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_transfer_record.token_type
     *
     * @mbg.generated
     */
    private String tokenType;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_transfer_record.log_index
     *
     * @mbg.generated
     */
    private Long logIndex;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_transfer_record.token_id
     *
     * @mbg.generated
     */
    private Long tokenId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_transfer_record.create_timestamp
     *
     * @mbg.generated
     */
    private Date createTimestamp;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tx_transfer_record.update_timestamp
     *
     * @mbg.generated
     */
    private Date updateTimestamp;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public BigInteger getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(BigInteger gasUsed) {
        this.gasUsed = gasUsed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_transfer_record.tx_hash
     *
     * @return the value of tx_transfer_record.tx_hash
     * @mbg.generated
     */
    public String getTxHash() {
        return txHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_transfer_record.tx_hash
     *
     * @param txHash the value for tx_transfer_record.tx_hash
     * @mbg.generated
     */
    public void setTxHash(String txHash) {
        this.txHash = txHash == null ? null : txHash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_transfer_record.block_hash
     *
     * @return the value of tx_transfer_record.block_hash
     * @mbg.generated
     */
    public String getBlockHash() {
        return blockHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_transfer_record.block_hash
     *
     * @param blockHash the value for tx_transfer_record.block_hash
     * @mbg.generated
     */
    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash == null ? null : blockHash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_transfer_record.block_number
     *
     * @return the value of tx_transfer_record.block_number
     * @mbg.generated
     */
    public Long getBlockNumber() {
        return blockNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_transfer_record.block_number
     *
     * @param blockNumber the value for tx_transfer_record.block_number
     * @mbg.generated
     */
    public void setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_transfer_record.block_timestamp
     *
     * @return the value of tx_transfer_record.block_timestamp
     * @mbg.generated
     */
    public Long getBlockTimestamp() {
        return blockTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_transfer_record.block_timestamp
     *
     * @param blockTimestamp the value for tx_transfer_record.block_timestamp
     * @mbg.generated
     */
    public void setBlockTimestamp(Long blockTimestamp) {
        this.blockTimestamp = blockTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_transfer_record.contract_address
     *
     * @return the value of tx_transfer_record.contract_address
     * @mbg.generated
     */
    public String getContractAddress() {
        return contractAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_transfer_record.contract_address
     *
     * @param contractAddress the value for tx_transfer_record.contract_address
     * @mbg.generated
     */
    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress == null ? null : contractAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_transfer_record.from_address
     *
     * @return the value of tx_transfer_record.from_address
     * @mbg.generated
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_transfer_record.from_address
     *
     * @param fromAddress the value for tx_transfer_record.from_address
     * @mbg.generated
     */
    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress == null ? null : fromAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_transfer_record.to_address
     *
     * @return the value of tx_transfer_record.to_address
     * @mbg.generated
     */
    public String getToAddress() {
        return toAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_transfer_record.to_address
     *
     * @param toAddress the value for tx_transfer_record.to_address
     * @mbg.generated
     */
    public void setToAddress(String toAddress) {
        this.toAddress = toAddress == null ? null : toAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_transfer_record.quantity
     *
     * @return the value of tx_transfer_record.quantity
     * @mbg.generated
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_transfer_record.quantity
     *
     * @param quantity the value for tx_transfer_record.quantity
     * @mbg.generated
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity == null ? null : quantity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_transfer_record.token_type
     *
     * @return the value of tx_transfer_record.token_type
     * @mbg.generated
     */
    public String getTokenType() {
        return tokenType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_transfer_record.token_type
     *
     * @param tokenType the value for tx_transfer_record.token_type
     * @mbg.generated
     */
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType == null ? null : tokenType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_transfer_record.log_index
     *
     * @return the value of tx_transfer_record.log_index
     * @mbg.generated
     */
    public Long getLogIndex() {
        return logIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_transfer_record.log_index
     *
     * @param logIndex the value for tx_transfer_record.log_index
     * @mbg.generated
     */
    public void setLogIndex(Long logIndex) {
        this.logIndex = logIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_transfer_record.token_id
     *
     * @return the value of tx_transfer_record.token_id
     * @mbg.generated
     */
    public Long getTokenId() {
        return tokenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_transfer_record.token_id
     *
     * @param tokenId the value for tx_transfer_record.token_id
     * @mbg.generated
     */
    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_transfer_record.create_timestamp
     *
     * @return the value of tx_transfer_record.create_timestamp
     * @mbg.generated
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_transfer_record.create_timestamp
     *
     * @param createTimestamp the value for tx_transfer_record.create_timestamp
     * @mbg.generated
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tx_transfer_record.update_timestamp
     *
     * @return the value of tx_transfer_record.update_timestamp
     * @mbg.generated
     */
    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tx_transfer_record.update_timestamp
     *
     * @param updateTimestamp the value for tx_transfer_record.update_timestamp
     * @mbg.generated
     */
    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tx_transfer_record
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TxTransferRecord other = (TxTransferRecord) that;
        return (this.getTxHash() == null ? other.getTxHash() == null : this.getTxHash().equals(other.getTxHash()))
                && (this.getBlockHash() == null ? other.getBlockHash() == null : this.getBlockHash().equals(other.getBlockHash()))
                && (this.getBlockNumber() == null ? other.getBlockNumber() == null : this.getBlockNumber().equals(other.getBlockNumber()))
                && (this.getBlockTimestamp() == null ? other.getBlockTimestamp() == null : this.getBlockTimestamp().equals(other.getBlockTimestamp()))
                && (this.getContractAddress() == null ? other.getContractAddress() == null : this.getContractAddress().equals(other.getContractAddress()))
                && (this.getFromAddress() == null ? other.getFromAddress() == null : this.getFromAddress().equals(other.getFromAddress()))
                && (this.getToAddress() == null ? other.getToAddress() == null : this.getToAddress().equals(other.getToAddress()))
                && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
                && (this.getTokenType() == null ? other.getTokenType() == null : this.getTokenType().equals(other.getTokenType()))
                && (this.getLogIndex() == null ? other.getLogIndex() == null : this.getLogIndex().equals(other.getLogIndex()))
                && (this.getTokenId() == null ? other.getTokenId() == null : this.getTokenId().equals(other.getTokenId()))
                && (this.getCreateTimestamp() == null ? other.getCreateTimestamp() == null : this.getCreateTimestamp().equals(other.getCreateTimestamp()))
                && (this.getUpdateTimestamp() == null ? other.getUpdateTimestamp() == null : this.getUpdateTimestamp().equals(other.getUpdateTimestamp()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tx_transfer_record
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTxHash() == null) ? 0 : getTxHash().hashCode());
        result = prime * result + ((getBlockHash() == null) ? 0 : getBlockHash().hashCode());
        result = prime * result + ((getBlockNumber() == null) ? 0 : getBlockNumber().hashCode());
        result = prime * result + ((getBlockTimestamp() == null) ? 0 : getBlockTimestamp().hashCode());
        result = prime * result + ((getContractAddress() == null) ? 0 : getContractAddress().hashCode());
        result = prime * result + ((getFromAddress() == null) ? 0 : getFromAddress().hashCode());
        result = prime * result + ((getToAddress() == null) ? 0 : getToAddress().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getTokenType() == null) ? 0 : getTokenType().hashCode());
        result = prime * result + ((getLogIndex() == null) ? 0 : getLogIndex().hashCode());
        result = prime * result + ((getTokenId() == null) ? 0 : getTokenId().hashCode());
        result = prime * result + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        result = prime * result + ((getUpdateTimestamp() == null) ? 0 : getUpdateTimestamp().hashCode());
        return result;
    }
}