package pendataansiswa;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DataSiswa extends javax.swing.JFrame {
    Umum k = new Umum();
    
    public DefaultTableModel tabelJur;
    
    private String dataValues[][];
    private int tambah = 0;
    private boolean checkTable = false;

    public DataSiswa() {
        k.konek();
        initComponents();
        
        JK.add(rdbLaki);
        JK.add(rdbPerempuan);
        btnUbah.setEnabled(false);
        rdbLaki.setSelected(true);
        
        tabelJur = (DefaultTableModel) tblJur.getModel();
        
        this.getContentPane().setBackground(new Color(69,183,255));
    }
    
    public void setKosongkan (){
        txtNI.setText(null);
        txtNISN.setText(null);
        txtNamaSiswa.setText(null);
        cmbJurusan.setSelectedIndex(0);
        txtTempatLahir.setText(null);
        cmbTanggalLahir.setSelectedIndex(0);
        cmbBulanLahir.setSelectedIndex(0);
        txtTahunLahir.setText(null);
        txtAlamatSiswa.setText(null);
        txtTelpSiswa.setText(null);
        cmbAngkatan.setSelectedIndex(0);
        rdbLaki.setSelected(true);
        btnUbah.setEnabled(false);
        btnTambah.setEnabled(true);
    }
    
    public void cleanTable(){
        int baris = tabelJur.getRowCount();
        for (int i=0; i<baris; i++){
            tabelJur.removeRow(0);
        }
    }
    
    public void loadDatabase(){
        if (checkTable == false){
            dataValues = new String [100][5];
            checkTable = true;
        }   
        cleanTable();
        String sql = "SELECT * FROM siswa";
        try {
            k.st = k.conn.createStatement();
            k.rs = k.st.executeQuery(sql);  
        } catch (SQLException ex){
        }

        try {
            while (k.rs.next()){
                String [] columnNames = {"NIS","Nama","Kelamin","Angkatan"};
                dataValues[tambah][0]=""+k.rs.getString("ni");
                dataValues[tambah][1]=""+k.rs.getString("nama");
                dataValues[tambah][2]=""+k.rs.getString("kelamin");
                dataValues[tambah][3]=""+k.rs.getString("angkatan");
                tabelJur.setDataVector(dataValues, columnNames);
                
            } 
            tblJur.setModel(tabelJur);
            tambah ++;
            k.rs.close(); 
            k.st.close(); 
        } catch (SQLException ex){ 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JK = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNI = new javax.swing.JTextField();
        txtNamaSiswa = new javax.swing.JTextField();
        cmbJurusan = new javax.swing.JComboBox<>();
        txtTempatLahir = new javax.swing.JTextField();
        cmbTanggalLahir = new javax.swing.JComboBox<>();
        cmbBulanLahir = new javax.swing.JComboBox<>();
        txtTahunLahir = new javax.swing.JTextField();
        rdbLaki = new javax.swing.JRadioButton();
        rdbPerempuan = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamatSiswa = new javax.swing.JTextArea();
        txtTelpSiswa = new javax.swing.JTextField();
        btnUbah = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbAngkatan = new javax.swing.JComboBox<>();
        btnBatal = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNISN = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblJur = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtHasil = new javax.swing.JTextArea();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("DATA PESERTA DIDIK");

        jLabel2.setText("Nomor Induk");

        jLabel3.setText("Nama");

        jLabel4.setText("Jurusan");

        jLabel5.setText("Tempat dan Tanggal Lahir");

        jLabel6.setText("Jenis Kelamin");

        jLabel9.setText("Alamat");

        jLabel10.setText("No Telp / HP");

        txtNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIActionPerformed(evt);
            }
        });

        txtNamaSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaSiswaActionPerformed(evt);
            }
        });

        cmbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RPL", "Animasi", "Multimedia" }));
        cmbJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJurusanActionPerformed(evt);
            }
        });

        cmbTanggalLahir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbBulanLahir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "July", "Agustus", "September", "Oktober", "November", "Desember" }));

        rdbLaki.setText("Laki - laki");
        rdbLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbLakiActionPerformed(evt);
            }
        });

        rdbPerempuan.setText("Perempuan");

        txtAlamatSiswa.setColumns(20);
        txtAlamatSiswa.setRows(5);
        jScrollPane1.setViewportView(txtAlamatSiswa);

        btnUbah.setBackground(new java.awt.Color(0, 102, 204));
        btnUbah.setForeground(new java.awt.Color(255, 255, 255));
        btnUbah.setText("Ubah");
        btnUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUbahMouseClicked(evt);
            }
        });
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        jLabel7.setText("Tahun Masuk");

        cmbAngkatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2018", "2017" }));

        btnBatal.setBackground(new java.awt.Color(0, 102, 204));
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnCari.setBackground(new java.awt.Color(0, 102, 204));
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel8.setText("NISN");

        txtNISN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNISNActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(0, 102, 204));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMouseClicked(evt);
            }
        });
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnKeluar.setBackground(new java.awt.Color(0, 102, 204));
        btnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        btnCetak.setText("Lihat");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        tblJur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIS", "Nama", "Kelamin", "Angkatan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblJur);
        if (tblJur.getColumnModel().getColumnCount() > 0) {
            tblJur.getColumnModel().getColumn(0).setResizable(false);
            tblJur.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblJur.getColumnModel().getColumn(1).setResizable(false);
            tblJur.getColumnModel().getColumn(1).setPreferredWidth(45);
            tblJur.getColumnModel().getColumn(2).setResizable(false);
            tblJur.getColumnModel().getColumn(2).setPreferredWidth(1);
            tblJur.getColumnModel().getColumn(3).setResizable(false);
            tblJur.getColumnModel().getColumn(3).setPreferredWidth(4);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtHasil.setColumns(20);
        txtHasil.setRows(5);
        jScrollPane4.setViewportView(txtHasil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUbah)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCetak)))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbAngkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnBatal)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnTambah))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTelpSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdbLaki)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbPerempuan))
                                    .addComponent(cmbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbBulanLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(txtTahunLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNISN, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(txtNI, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCari))))
                            .addComponent(jLabel7)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnKeluar)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNISN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCari))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBulanLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTahunLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTempatLahir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbLaki)
                            .addComponent(rdbPerempuan)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelpSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbAngkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUbah)
                            .addComponent(btnBatal)
                            .addComponent(btnTambah)
                            .addComponent(btnCetak))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKeluar)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJurusanActionPerformed

    }//GEN-LAST:event_cmbJurusanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        
    }//GEN-LAST:event_btnUbahActionPerformed

    private void rdbLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbLakiActionPerformed

    }//GEN-LAST:event_rdbLakiActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        setKosongkan();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        String sql="SELECT * FROM siswa WHERE nama='"+txtNamaSiswa.getText().toUpperCase()+"'";
        try {
            k.st = k.conn.createStatement();
            k.rs = k.st.executeQuery(sql);  
        } catch (SQLException ex){
            System.out.printf("kesalahan Qurey "+sql);
        }
        
        int size=0;
        try {
            while (k.rs.next()){
                size++;
                txtNI.setText(k.rs.getString("ni"));  
                txtNISN.setText(k.rs.getString("nisn"));  
                txtNamaSiswa.setText(k.rs.getString("nama"));
                String jurusan = k.rs.getString("jurusan");
                int index;
                switch (jurusan){
                    case "RPL" : cmbJurusan.setSelectedIndex(0); break;
                    case "Animasi": cmbJurusan.setSelectedIndex(1); break;
                    case "Multimedia" : cmbJurusan.setSelectedIndex(2); break;
                }
                //--------------------------------
                //SET Tanggal Lahir pada comboBox
                //--------------------------------
                for(int i=0; i<31; i++){
                    txtTempatLahir.setText(k.rs.getString("tempatLahir"));
                    String ttl = k.rs.getString("ttl"); //01-Agustus-2000
                    String tanggalLahir = ttl.substring(0,2); //01
                    String nilai = cmbTanggalLahir.getSelectedItem().toString();
                    if (!tanggalLahir.equals(nilai)){
                        cmbTanggalLahir.setSelectedIndex(i); 
                    } else {
                        break;
                    }
                }
                //---------------------------------------------
                //SET bulan Lahir dan tahun lahir pada comboBox
                //---------------------------------------------
                for (int i=0; i<12; i++){
                    txtTempatLahir.setText(k.rs.getString("tempatLahir"));
                    String ttl = k.rs.getString("ttl"); //01-Agustus-2000
                    String tanggalLahir = ttl.substring(0,2); //01
                    String bulanTahun = ttl.substring(3); //Agustus-2000
                    int bulan = bulanTahun.indexOf('-'); //index ke-7
                    String bulanLahir = bulanTahun.substring(0,bulan); //Agustus 
                    String nilai = cmbBulanLahir.getSelectedItem().toString();
                    if (!bulanLahir.equals(nilai)){
                        cmbBulanLahir.setSelectedIndex(i); 
                    }else {
                        String tahunLahir = ttl.substring(bulan+4); //2000
                        txtTahunLahir.setText(tahunLahir);
                        break;
                    }
                }
                
                String kelamin = k.rs.getString("kelamin");
                switch (kelamin){
                    case "P" : rdbPerempuan.setSelected(true); break;
                    case "L" : rdbLaki.setSelected(true); break;
                }
                
                txtAlamatSiswa.setText(k.rs.getString("alamat"));  
                txtTelpSiswa.setText(k.rs.getString("telp"));  
               
                String angkatan = k.rs.getString("angkatan");
                switch (angkatan){
                    case "2017" : cmbAngkatan.setSelectedIndex(2); break;
                    case "2018" : cmbAngkatan.setSelectedIndex(1); break;
                    case "2019" : cmbAngkatan.setSelectedIndex(0); break;
                }
                
            }
            if(size==0){  
                JOptionPane.showMessageDialog(this,"Data tidak ditemukan");   
                return;
            }
            k.rs.close(); 
            k.st.close(); 
        } catch (SQLException ex){ 
        }
        btnUbah.setEnabled(true);
        btnTambah.setEnabled(false);
    }                                        

    private void jBtnSimpanMouseClicked(java.awt.event.MouseEvent evt) {                                        

    }//GEN-LAST:event_btnCariActionPerformed

    private void txtNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIActionPerformed

    }//GEN-LAST:event_txtNIActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed

    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseClicked
        char kelamin;
        if (rdbLaki.isSelected())
            kelamin = 'L';
        else 
            kelamin = 'P';
        
        String ttl = cmbTanggalLahir.getSelectedItem().toString()+"-"+
                cmbBulanLahir.getSelectedItem().toString()+"-"+
                txtTahunLahir.getText();

        String sql= "UPDATE siswa SET ni = '"+txtNI.getText()+"',"
                + "nisn = '"+ txtNI.getText()+"',"
                + "nama = '"+ txtNamaSiswa.getText().toUpperCase()+"',"
                + "jurusan = '"+ cmbJurusan.getSelectedItem().toString()+"',"
                + "tempatLahir = '"+ txtTempatLahir.getText()+"',"
                + "ttl = '"+ ttl +"',"
                + "kelamin ='"+ kelamin +"',"
                + "alamat = '"+ txtAlamatSiswa.getText()+"',"
                + "telp = '"+ txtTelpSiswa.getText()+"',"
                + "angkatan = "+Integer.parseInt(cmbAngkatan.getSelectedItem().toString())+" "
                + "WHERE nama = '"+txtNamaSiswa.getText().toUpperCase()+"'";
      
        try {
            k.st = k.conn.createStatement();
            k.st.execute(sql); // menjalankan query
        } catch (SQLException e){ //jika gagal menyimpan
            JOptionPane.showMessageDialog(this,"Pengubahan Gagal"+sql);
            setKosongkan();
            txtNamaSiswa.requestFocus();
            return;
        }
        JOptionPane.showMessageDialog(this,"Data Berhasil diubah");
        setKosongkan();
        txtNamaSiswa.requestFocus();
    }//GEN-LAST:event_btnUbahMouseClicked

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
        char kelamin;
        if (rdbLaki.isSelected()){
            kelamin = 'L';}
        else {
            kelamin = 'P';}
        
        String ttl = cmbTanggalLahir.getSelectedItem().toString()+"-"+
                cmbBulanLahir.getSelectedItem().toString()+"-"+
                txtTahunLahir.getText();
        
        String sql= "INSERT siswa (ni, nisn, nama, jurusan, tempatLahir, ttl, kelamin, alamat, telp, angkatan) VALUE('"+
            txtNI.getText()+"','"+
            txtNISN.getText()+"','"+
            txtNamaSiswa.getText().toUpperCase()+"','"+
            cmbJurusan.getSelectedItem().toString()+"','"+
            txtTempatLahir.getText()+"','"+
            ttl+"','"+    
            kelamin+"','"+ 
            txtAlamatSiswa.getText()+"','"+ 
            txtTelpSiswa.getText()+"',"+ 
            Integer.parseInt(cmbAngkatan.getSelectedItem().toString())+")";

        try {
            k.st = k.conn.createStatement();
            k.st.execute(sql); // menjalankan query
        } catch (SQLException e){ //jika gagal menyimpan
            JOptionPane.showMessageDialog(this,"Penyimpanan Gagal");
            setKosongkan();
            txtNamaSiswa.requestFocus(); 
            return;
        }
        JOptionPane.showMessageDialog(this,"Data Berhasil disimpan");
        cleanTable();
        setKosongkan();
        txtNamaSiswa.requestFocus();
        loadDatabase();
    }//GEN-LAST:event_btnTambahMouseClicked

    private void txtNamaSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaSiswaActionPerformed

    }//GEN-LAST:event_txtNamaSiswaActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        String kelamin;
        if (rdbLaki.isSelected()){
            kelamin = "Laki-laki";}
        else {
            kelamin = "Perempuan";}
        
        txtHasil.setText("-------------------------------------------------------------------------------"
        +"\n----------------------DATA PESERTA DIDIK--------------------------"
        +"\n-------------------------------------------------------------------------------"
        +"\n\n Nomor Induk = "+txtNI.getText()
        +"\n\n NISN = "+txtNISN.getText()
        +"\n\n Nama = "+txtNamaSiswa.getText()
        +"\n\n Jurusan = "+cmbJurusan.getSelectedItem().toString()
        +"\n\n Tempat dan Tanggal Lahir = "+txtTempatLahir.getText()+" , "
        + cmbTanggalLahir.getSelectedItem().toString() +" - "
        + cmbBulanLahir.getSelectedItem().toString() +" - "
        + txtTahunLahir.getText()
        +"\n\n Jenis Kelamin = "+kelamin    
        +"\n\n Alamat = "+txtAlamatSiswa.getText()
        +"\n\n Telp/Hp = "+txtTelpSiswa.getText()  
        +"\n\n Angkatan = "+cmbAngkatan.getSelectedItem().toString());        
    }//GEN-LAST:event_btnCetakActionPerformed

    private void txtNISNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNISNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNISNActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup JK;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbAngkatan;
    private javax.swing.JComboBox<String> cmbBulanLahir;
    private javax.swing.JComboBox<String> cmbJurusan;
    private javax.swing.JComboBox<String> cmbTanggalLahir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rdbLaki;
    private javax.swing.JRadioButton rdbPerempuan;
    private javax.swing.JTable tblJur;
    private javax.swing.JTextArea txtAlamatSiswa;
    private javax.swing.JTextArea txtHasil;
    private javax.swing.JTextField txtNI;
    private javax.swing.JTextField txtNISN;
    private javax.swing.JTextField txtNamaSiswa;
    private javax.swing.JTextField txtTahunLahir;
    private javax.swing.JTextField txtTelpSiswa;
    private javax.swing.JTextField txtTempatLahir;
    // End of variables declaration//GEN-END:variables
}
