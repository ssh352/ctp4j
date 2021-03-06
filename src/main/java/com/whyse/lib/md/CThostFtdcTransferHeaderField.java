package com.whyse.lib.md;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\u05ea\ufffd\u02b1\ufffd\ufffd\ufffd\u0377<br>
 * <i>native declaration : src\main\resources\lib\headfile\ThostFtdcUserApiStruct.h:80</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Md") 
public class CThostFtdcTransferHeaderField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcVersionType */
	@Array({4}) 
	@Field(0) 
	public Pointer<Byte > Version() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcTradeCodeType */
	@Array({7}) 
	@Field(1) 
	public Pointer<Byte > TradeCode() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9}) 
	@Field(2) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcTradeTimeType */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcTradeSerialType */
	@Array({9}) 
	@Field(4) 
	public Pointer<Byte > TradeSerial() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcFutureIDType */
	@Array({11}) 
	@Field(5) 
	public Pointer<Byte > FutureID() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : TThostFtdcBankIDType */
	@Array({4}) 
	@Field(6) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : TThostFtdcBankBrchIDType */
	@Array({5}) 
	@Field(7) 
	public Pointer<Byte > BankBrchID() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcOperNoType */
	@Array({17}) 
	@Field(8) 
	public Pointer<Byte > OperNo() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : TThostFtdcDeviceIDType */
	@Array({3}) 
	@Field(9) 
	public Pointer<Byte > DeviceID() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : TThostFtdcRecordNumType */
	@Array({7}) 
	@Field(10) 
	public Pointer<Byte > RecordNum() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(11) 
	public int SessionID() {
		return this.io.getIntField(this, 11);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(11) 
	public CThostFtdcTransferHeaderField SessionID(int SessionID) {
		this.io.setIntField(this, 11, SessionID);
		return this;
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(12) 
	public int RequestID() {
		return this.io.getIntField(this, 12);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(12) 
	public CThostFtdcTransferHeaderField RequestID(int RequestID) {
		this.io.setIntField(this, 12, RequestID);
		return this;
	}
	public CThostFtdcTransferHeaderField() {
		super();
	}
	public CThostFtdcTransferHeaderField(Pointer pointer) {
		super(pointer);
	}
}
