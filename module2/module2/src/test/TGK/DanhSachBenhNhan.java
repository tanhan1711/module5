package test.TGK;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DanhSachBenhNhan {

    private BenhNhan[] listBn;
    private int n;

    public DanhSachBenhNhan() {
    }

    public DanhSachBenhNhan(int n) {
        this.n = n;
        this.listBn = new BenhNhan[n];
    }

    public void inputFile() {
        FileOutputStream fos = null;
        try {
            Scanner scan = new Scanner(System.in);
            String strInfo;
            String key;
            fos = new FileOutputStream("DanhSachBenhNhan.txt");

            for (int i = 0; i < n; i++) {
                strInfo = "";
                String choose;
                BenhNhan benhNhan = null;
                System.out.println("Benh nhan BHYT (Y)\nBenh nhan BHXH (X)");
                choose = scan.nextLine();
                if (choose.equalsIgnoreCase("Y")) {
                    strInfo += "Y, ";
                    benhNhan = new BenhNhanBaoHiemYTe();
                }
                if (choose.equalsIgnoreCase("X")) {
                    strInfo += "X, ";
                    benhNhan = new BenhNhanBaoHiemXaHoi();
                }
                strInfo += benhNhan.input() + "\n";
                byte[] b = strInfo.getBytes();
                fos.write(b);
                listBn[i] = benhNhan;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DanhSachBenhNhan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DanhSachBenhNhan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(DanhSachBenhNhan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void display() {
        for (BenhNhan bn : listBn) {
            if(bn == null) {
                break;
            } else {
                bn.display();
            }
        }
    }

    public void insert(BenhNhan benhNhan) {
        n++;
        listBn[n-1] = benhNhan;
//        n++;
    }

    public void remove(String maBN) {
        for (int i = 0; i < n; i++) {
            if (listBn[i].getMaBN().equalsIgnoreCase(maBN)) {
                for (int j = i; j < n - 1; j++) {
                    listBn[j] = listBn[j + 1];
                }
                listBn[n - 1] = null;
                n--;
            }
        }
    }

    public BenhNhan searchByMaBN(String maBN) {
        for(BenhNhan bn : listBn) {
            if(bn.getMaBN().equalsIgnoreCase(maBN)) {
                return bn;
            }
        }
        return null;
    }

    public double sumBHYT() {
        double sum = 0;
        for (BenhNhan bn : listBn) {
            if (bn instanceof BenhNhanBaoHiemYTe) {
                sum += ((BenhNhanBaoHiemYTe) bn).tinhHoaDonVienPhi();
            }
        }
        return sum;
    }

    public double sumBHXH() {
        double sum = 0;
        for (BenhNhan bn : listBn) {
            if (bn instanceof BenhNhanBaoHiemXaHoi) {
                sum += ((BenhNhanBaoHiemXaHoi) bn).tinhHoaDonVienPhi();
            }
        }
        return sum;
    }

    public void loadFile() {
        FileInputStream fis = null;
        InputStreamReader reader = null;
        BufferedReader buffer = null;
        try {

            fis = new FileInputStream("DanhSachBenhNhan.txt");
            reader = new InputStreamReader(fis, StandardCharsets.UTF_8);
            buffer = new BufferedReader(reader);

            String line;
            int i = 0;
            while ((line = buffer.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }
                String[] params = line.split(", ");
                String maBN = params[1];
                String hoTen = params[2];
                String ngayNhapVien = params[3];
                String ngayRaVien = params[4];
                String phong = String.valueOf(params[5]);
                BenhNhan benhNhan = null;

                if(params[0].equalsIgnoreCase("Y")) {
                    String maBHYT = params[6];
                    benhNhan = new BenhNhanBaoHiemYTe(maBHYT, maBN, hoTen, ngayNhapVien, ngayRaVien, true);
                } else {
                    String maBHXH = params[6];
                    benhNhan = new BenhNhanBaoHiemXaHoi(maBN, hoTen, ngayNhapVien, ngayRaVien, true, maBHXH);
                }
                listBn[i] = benhNhan;
                i++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DanhSachBenhNhan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DanhSachBenhNhan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (IOException ex) {
                    Logger.getLogger(DanhSachBenhNhan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(DanhSachBenhNhan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(DanhSachBenhNhan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
}
