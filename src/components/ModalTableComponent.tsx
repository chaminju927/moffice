import React, { ReactNode, useEffect, useState } from "react";
import MUITable from "@mui/material/Table";
import TableContainer from "@mui/material/TableContainer";
import TableHead from "@mui/material/TableHead";
import TableRow from "@mui/material/TableRow";
import TableCell from "@mui/material/TableCell";
import Button from "@mui/material/Button";
import SearchIcon from "@mui/icons-material/Search";
import ButtonComponent from "./ButtonComponent";
import { TableBody } from "@mui/material";
import { dataType } from "./ModalComponent";

interface CustomTableProps {
  children: ReactNode;
}
const CustomTable: React.FC<CustomTableProps> = ({ children }) => {
  return (
    <MUITable
      sx={{
        borderCollapse: "collapse",
        "& th, & td": {
          border: "1px solid #d2d6e0",
          padding: "8px",
          textAlign: "center",
        },
      }}
    >
      {children}
    </MUITable>
  );
};

function ModalTableComponent({ rows }: { rows: dataType[] }): JSX.Element {
  const [data, setData] = useState([]);

  return (
    <div>
      <TableContainer className="subTable">
        <CustomTable>
          <TableHead>
            <TableRow>
              <TableCell>이름/사번</TableCell>
              <TableCell colSpan={3}></TableCell>
              <TableCell>
                <ButtonComponent />
              </TableCell>
            </TableRow>
          </TableHead>
          <TableHead>
            <TableRow>
              <TableCell>사번</TableCell>
              <TableCell>부서</TableCell>
              <TableCell>이름</TableCell>
              <TableCell>직위</TableCell>
              <TableCell>선택</TableCell>
            </TableRow>
          </TableHead>
          <TableBody>
            {rows.map((row) => (
              <TableRow key={row.no}>
                <TableCell>{row.no}</TableCell>
                <TableCell>{row.part}</TableCell>
                <TableCell>{row.name}</TableCell>
                <TableCell>{row.grade}</TableCell>
                <TableCell>{row.option}</TableCell>
              </TableRow>
            ))}
          </TableBody>
        </CustomTable>
      </TableContainer>
    </div>
  );
}

export default ModalTableComponent;