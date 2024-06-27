namespace 課題8
{
    partial class Form_Main
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            listView1 = new ListView();
            columnHeader1 = new ColumnHeader();
            columnHeader2 = new ColumnHeader();
            columnHeader3 = new ColumnHeader();
            columnHeader4 = new ColumnHeader();
            button1 = new Button();
            button_Delete = new Button();
            button_Edit = new Button();
            button_Regist = new Button();
            SuspendLayout();
            // 
            // listView1
            // 
            listView1.Columns.AddRange(new ColumnHeader[] { columnHeader1, columnHeader2, columnHeader3, columnHeader4 });
            listView1.FullRowSelect = true;
            listView1.GridLines = true;
            listView1.Location = new Point(12, 12);
            listView1.Name = "listView1";
            listView1.Size = new Size(519, 363);
            listView1.TabIndex = 0;
            listView1.UseCompatibleStateImageBehavior = false;
            listView1.View = View.Details;
            // 
            // columnHeader1
            // 
            columnHeader1.Text = "名前";
            columnHeader1.Width = 200;
            // 
            // columnHeader2
            // 
            columnHeader2.Text = "国語";
            columnHeader2.Width = 80;
            // 
            // columnHeader3
            // 
            columnHeader3.Text = "数学";
            columnHeader3.Width = 80;
            // 
            // columnHeader4
            // 
            columnHeader4.Text = "英語";
            columnHeader4.Width = 80;
            // 
            // button1
            // 
            button1.Location = new Point(391, 399);
            button1.Name = "button1";
            button1.Size = new Size(121, 29);
            button1.TabIndex = 1;
            button1.Text = "生徒名登録";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // button_Delete
            // 
            button_Delete.Location = new Point(34, 399);
            button_Delete.Name = "button_Delete";
            button_Delete.Size = new Size(94, 29);
            button_Delete.TabIndex = 2;
            button_Delete.Text = "削除";
            button_Delete.UseVisualStyleBackColor = true;
            button_Delete.Click += button_Delete_Click;
            // 
            // button_Edit
            // 
            button_Edit.Location = new Point(157, 399);
            button_Edit.Name = "button_Edit";
            button_Edit.Size = new Size(94, 29);
            button_Edit.TabIndex = 3;
            button_Edit.Text = "更新";
            button_Edit.UseVisualStyleBackColor = true;
            button_Edit.Click += button_Edit_Click;
            // 
            // button_Regist
            // 
            button_Regist.Location = new Point(274, 399);
            button_Regist.Name = "button_Regist";
            button_Regist.Size = new Size(94, 29);
            button_Regist.TabIndex = 4;
            button_Regist.Text = "登録";
            button_Regist.UseVisualStyleBackColor = true;
            button_Regist.Click += button_Regist_Click;
            // 
            // Form_Main
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(543, 450);
            Controls.Add(button_Regist);
            Controls.Add(button_Edit);
            Controls.Add(button_Delete);
            Controls.Add(button1);
            Controls.Add(listView1);
            Name = "Form_Main";
            Load += Form_Main_Load;
            ResumeLayout(false);
        }

        #endregion

        private ListView listView1;
        private ColumnHeader columnHeader1;
        private ColumnHeader columnHeader2;
        private ColumnHeader columnHeader3;
        private ColumnHeader columnHeader4;
        private Button button1;
        private Button button_Delete;
        private Button button_Edit;
        private Button button_Regist;
    }
}
