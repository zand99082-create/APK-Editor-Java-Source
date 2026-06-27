package p000a.p014d;

import java.io.DataInput;
import java.io.IOException;

/* JADX INFO: renamed from: a.d.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0084d implements DataInput {

    /* JADX INFO: renamed from: a */
    private DataInput f228a;

    public AbstractC0084d(DataInput dataInput) {
        this.f228a = dataInput;
    }

    /* JADX INFO: renamed from: a */
    public final int[] m211a(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt();
        }
        return iArr;
    }

    @Override // java.io.DataInput
    public boolean readBoolean() {
        return this.f228a.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() {
        return this.f228a.readByte();
    }

    @Override // java.io.DataInput
    public char readChar() {
        return this.f228a.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() {
        return this.f228a.readDouble();
    }

    @Override // java.io.DataInput
    public float readFloat() {
        return this.f228a.readFloat();
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        this.f228a.readFully(bArr);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f228a.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public int readInt() {
        return this.f228a.readInt();
    }

    @Override // java.io.DataInput
    public String readLine() {
        return this.f228a.readLine();
    }

    @Override // java.io.DataInput
    public long readLong() {
        return this.f228a.readLong();
    }

    @Override // java.io.DataInput
    public short readShort() {
        return this.f228a.readShort();
    }

    @Override // java.io.DataInput
    public String readUTF() {
        return this.f228a.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() {
        return this.f228a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() {
        return this.f228a.readUnsignedShort();
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) {
        return this.f228a.skipBytes(i);
    }
}
