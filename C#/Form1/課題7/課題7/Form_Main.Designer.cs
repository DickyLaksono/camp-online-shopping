namespace 課題7
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
            departure = new GroupBox();
            arival = new GroupBox();
            checkBox1 = new CheckBox();
            textBox1 = new TextBox();
            button_Display = new Button();
            tokyo1 = new RadioButton();
            shinjuku1 = new RadioButton();
            shinagawa1 = new RadioButton();
            tokyo2 = new RadioButton();
            shinjuku2 = new RadioButton();
            shinagawa2 = new RadioButton();
            departure.SuspendLayout();
            arival.SuspendLayout();
            SuspendLayout();
            // 
            // departure
            // 
            departure.Controls.Add(tokyo1);
            departure.Controls.Add(shinagawa1);
            departure.Controls.Add(shinjuku1);
            departure.Location = new Point(48, 57);
            departure.Name = "departure";
            departure.Size = new Size(189, 184);
            departure.TabIndex = 0;
            departure.TabStop = false;
            departure.Text = "出発駅";
            // 
            // arival
            // 
            arival.Controls.Add(shinagawa2);
            arival.Controls.Add(tokyo2);
            arival.Controls.Add(shinjuku2);
            arival.Location = new Point(304, 57);
            arival.Name = "arival";
            arival.Size = new Size(189, 184);
            arival.TabIndex = 1;
            arival.TabStop = false;
            arival.Text = "下車駅";
            // 
            // checkBox1
            // 
            checkBox1.AutoSize = true;
            checkBox1.Location = new Point(584, 84);
            checkBox1.Name = "checkBox1";
            checkBox1.Size = new Size(153, 24);
            checkBox1.TabIndex = 2;
            checkBox1.Text = "子供の料金の計算";
            checkBox1.UseVisualStyleBackColor = true;
            // 
            // textBox1
            // 
            textBox1.Location = new Point(584, 138);
            textBox1.Name = "textBox1";
            textBox1.ReadOnly = true;
            textBox1.Size = new Size(125, 27);
            textBox1.TabIndex = 3;
            // 
            // button_Display
            // 
            button_Display.Location = new Point(584, 212);
            button_Display.Name = "button_Display";
            button_Display.Size = new Size(94, 29);
            button_Display.TabIndex = 4;
            button_Display.Text = "表示";
            button_Display.UseVisualStyleBackColor = true;
            button_Display.Click += button_Display_Click;
            // 
            // tokyo1
            // 
            tokyo1.AutoSize = true;
            tokyo1.Location = new Point(6, 38);
            tokyo1.Name = "tokyo1";
            tokyo1.Size = new Size(62, 24);
            tokyo1.TabIndex = 5;
            tokyo1.TabStop = true;
            tokyo1.Text = "東京";
            tokyo1.UseVisualStyleBackColor = true;
            // 
            // shinjuku1
            // 
            shinjuku1.AutoSize = true;
            shinjuku1.Location = new Point(6, 84);
            shinjuku1.Name = "shinjuku1";
            shinjuku1.Size = new Size(62, 24);
            shinjuku1.TabIndex = 6;
            shinjuku1.TabStop = true;
            shinjuku1.Text = "新宿";
            shinjuku1.UseVisualStyleBackColor = true;
            // 
            // shinagawa1
            // 
            shinagawa1.AutoSize = true;
            shinagawa1.Location = new Point(6, 139);
            shinagawa1.Name = "shinagawa1";
            shinagawa1.Size = new Size(62, 24);
            shinagawa1.TabIndex = 7;
            shinagawa1.TabStop = true;
            shinagawa1.Text = "品川";
            shinagawa1.UseVisualStyleBackColor = true;
            // 
            // tokyo2
            // 
            tokyo2.AutoSize = true;
            tokyo2.Location = new Point(6, 38);
            tokyo2.Name = "tokyo2";
            tokyo2.Size = new Size(62, 24);
            tokyo2.TabIndex = 8;
            tokyo2.TabStop = true;
            tokyo2.Text = "東京";
            tokyo2.UseVisualStyleBackColor = true;
            // 
            // shinjuku2
            // 
            shinjuku2.AutoSize = true;
            shinjuku2.Location = new Point(6, 84);
            shinjuku2.Name = "shinjuku2";
            shinjuku2.Size = new Size(62, 24);
            shinjuku2.TabIndex = 9;
            shinjuku2.TabStop = true;
            shinjuku2.Text = "新宿";
            shinjuku2.UseVisualStyleBackColor = true;
            // 
            // shinagawa2
            // 
            shinagawa2.AutoSize = true;
            shinagawa2.Location = new Point(6, 139);
            shinagawa2.Name = "shinagawa2";
            shinagawa2.Size = new Size(62, 24);
            shinagawa2.TabIndex = 10;
            shinagawa2.TabStop = true;
            shinagawa2.Text = "品川";
            shinagawa2.UseVisualStyleBackColor = true;
            // 
            // Form_Main
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button_Display);
            Controls.Add(textBox1);
            Controls.Add(checkBox1);
            Controls.Add(arival);
            Controls.Add(departure);
            Name = "Form_Main";
            Text = "Form1";
            departure.ResumeLayout(false);
            departure.PerformLayout();
            arival.ResumeLayout(false);
            arival.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private GroupBox departure;
        private RadioButton tokyo1;
        private RadioButton shinagawa1;
        private RadioButton shinjuku1;
        private GroupBox arival;
        private RadioButton shinagawa2;
        private RadioButton tokyo2;
        private RadioButton shinjuku2;
        private CheckBox checkBox1;
        private TextBox textBox1;
        private Button button_Display;
    }
}
